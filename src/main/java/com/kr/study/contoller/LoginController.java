package com.kr.study.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.entity.UserInfoDto;
import com.kr.study.service.LoginService;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	LoginService service;

	@RequestMapping("loginCheck")
	public ModelAndView logincheck(@ModelAttribute("home") UserInfoDto dto) {
		logger.info("컨트롤러-로그인 체크");

		ModelAndView mv = service.loginCheck(dto);

		return mv;
	}


}
