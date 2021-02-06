package com.kr.study.dao;

import java.util.List;

import com.kr.study.entity.UserInfoDto;

public interface UserInfoDao {

	List<UserInfoDto> userInfo();

	int createUser(UserInfoDto dto);

	UserInfoDto moveModifyUserInfo(String id);

	int updateUserInfo(UserInfoDto dto);


}
