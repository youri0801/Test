package com.kr.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kr.study.entity.UserInfoDto;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {

	@Autowired
	SqlSessionTemplate sqlSession;

	@Override
	public List<UserInfoDto> userInfo() {
		List<UserInfoDto> result = sqlSession.selectList("UserInfo.roadUserInfo");

		return result;
	}

	@Override
	public int createUser(UserInfoDto dto) {
		int result2 = sqlSession.insert("UserInfo.insertOne", dto);

		return result2;
	}

	@Override
	public UserInfoDto moveModifyUserInfo(String id) {

		UserInfoDto dto = sqlSession.selectOne("UserInfo.loadUserInfo", id);

		return dto;
	}

	@Override
	public int updateUserInfo(UserInfoDto dto) {
		int result3 = sqlSession.update("UserInfo.updateUserInfo", dto);

		return result3;
	}

}
