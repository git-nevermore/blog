package com.chenwenjie.blog.user.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.chenwenjie.blog.common.dao.AbstractBaseDao;
import com.chenwenjie.blog.user.bean.UserQueryParam;
import com.chenwenjie.blog.user.entity.User;

@Repository
public class UserDaoImpl extends AbstractBaseDao{

	public List<User> queryUsers(UserQueryParam userQueryParam){
		StringBuilder sb = new StringBuilder("select user from User as user where 1=1");
		if (StringUtils.hasText(userQueryParam.getNickname())){
			sb.append(" and nickname like '%" + userQueryParam.getNickname()  +"%'");
		}
		if (StringUtils.hasText(userQueryParam.getUsername())){
			sb.append(" and username like '%" + userQueryParam.getUsername()  +"%'");
		}
		if (StringUtils.hasText(userQueryParam.getType())){
			sb.append(" and type = '" + userQueryParam.getType() + "'");
		}
		TypedQuery<User> query = getEntityManager().createQuery(sb.toString(),User.class);
		
		return query.getResultList();
	}

}
