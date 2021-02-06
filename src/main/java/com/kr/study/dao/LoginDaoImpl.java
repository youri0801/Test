package com.kr.study.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kr.study.entity.UserInfoDto;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	SqlSessionTemplate sqlSession;

	@Override
	public String loginCheck(UserInfoDto dto) {
		String result = sqlSession.selectOne("UserInfo.selectId", dto);
		//mapper의 키값을 넣으므로써 사용할 mapper를 지정

		return result;
	}


}
