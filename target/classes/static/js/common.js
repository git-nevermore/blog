/**
 * 获取项目根路径
 * @returns
 */
function getContextPath(){   						
    var pathName = document.location.pathname;   	
    var index = pathName.substr(1).indexOf("/");   
    var result = pathName.substr(0,index+1);   
    return result;   								
} 

/**
 * 返回前一页面
 * @returns
 */
function back() {
    if ((navigator.userAgent.indexOf('MSIE') >= 0) && (navigator.userAgent.indexOf('Opera') < 0)) { // IE  
        if (history.length > 0) {
            window.history.go(-1);
        } 
    } else { //非IE浏览器  
        if (navigator.userAgent.indexOf('Firefox') >= 0 ||
            navigator.userAgent.indexOf('Opera') >= 0 ||
            navigator.userAgent.indexOf('Safari') >= 0 ||
            navigator.userAgent.indexOf('Chrome') >= 0 ||
            navigator.userAgent.indexOf('WebKit') >= 0) {
            if (window.history.length > 2) {
                window.history.go(-1);
            } 
        } else {//未知的浏览器  
            if (history.length > 1) {
                window.history.go(-1);
            } 
        }
    }
}

/**
 * 返回登录页面
 * @returns
 */
function index() {
	 window.location.href="/springboot"
}