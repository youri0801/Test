package com.kr.study.service;

import org.springframework.web.servlet.ModelAndView;

import com.kr.study.entity.UserInfoDto;

public interface UserInfoService {

	ModelAndView userInfo();

	ModelAndView createUser(UserInfoDto dto);

//	ModelAndView modifyUserInfo(UserInfoDto dto);

	ModelAndView moveModifyUserInfo(String id);

	ModelAndView updateUserInfo(UserInfoDto dto);

}
