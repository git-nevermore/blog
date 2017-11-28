package com.chenwenjie.blog.common.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenwenjie.blog.common.bean.ErrResult;
import com.chenwenjie.blog.common.constant.ApiResultDef;
import com.chenwenjie.blog.common.exception.BaseException;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionController {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionController.class);

	@ExceptionHandler(BaseException.class)
	public ErrResult handleBaseException(BaseException ex, HttpServletRequest request, HttpServletResponse response) {
		return exceptionHandler(ex,request,response);
	}
	
	private ErrResult exceptionHandler(BaseException ex, HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setStatus(ApiResultDef.HTTP_FAILED);
			ErrResult result = new ErrResult();
			result.setCode(ApiResultDef.HTTP_FAILED);
			result.setMessage(ex.getMessage());
			handleLog(request,ex);
			
			return result;
		} catch (Exception e) {
			logger.error("exceptionHandler error", e);
		}
		return null;
	}
	
	private void handleLog(HttpServletRequest request, Exception ex) {  
        StringBuffer logBuffer = new StringBuffer();  
        if (request != null) {  
            logBuffer.append(" request method=" + request.getMethod());  
            logBuffer.append(" url=" + request.getRequestURL());  
        }  
        if (ex != null) {  
            logBuffer.append(" exception:" + ex);  
        }  
        logger.error(logBuffer.toString(),ex);  
    }  
}
