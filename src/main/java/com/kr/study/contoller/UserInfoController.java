package com.kr.study.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.entity.UserInfoDto;
import com.kr.study.service.UserInfoService;

@Controller
public class UserInfoController {

	private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

	@Autowired
	UserInfoService service;

	@RequestMapping("user_info")
	public ModelAndView roadUserInfo() {
		logger.info("컨트롤러-유저 정보 불러오기");

		ModelAndView mv = service.userInfo();

		return mv;
	}

	@RequestMapping("moveCreateUser")
	public String moveCreateUser() {
		logger.info("컨트롤러-유저 생성 화면 이동");

		return "createUser";
	}

	@RequestMapping("createUser")
	public ModelAndView createUser(@ModelAttribute("createUser") UserInfoDto dto) {
		logger.info("컨트롤러-유저 생성");

		ModelAndView mv = service.createUser(dto);

		return mv;
	}

	@RequestMapping("moveModifyUserInfo")
	public ModelAndView moveModifyUserInfo(String id) {
		logger.info("컨트롤러-유저 정보 수정 화면 이동");

		ModelAndView mv = service.moveModifyUserInfo(id);

		return mv;
	}

	@RequestMapping("updateUserInfo")
	public ModelAndView updateUserInfo(@ModelAttribute("modifyUserInfo") UserInfoDto dto) {

			ModelAndView mv = service.updateUserInfo(dto);

		return mv;
	}


	}
