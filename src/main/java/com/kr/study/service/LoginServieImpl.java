package com.kr.study.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.contoller.LoginController;
import com.kr.study.dao.LoginDao;
import com.kr.study.entity.UserInfoDto;
@Service

public class LoginServieImpl implements LoginService {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	LoginDao dao;

	@Override
	public ModelAndView loginCheck(UserInfoDto dto) {

		ModelAndView mv = new ModelAndView();

		String result = dao.loginCheck(dto);

		logger.info("서비스-로그인 체크");

		//select를 통해 id를 받아옴, id가 일치하면 로그인 성공, id가 없을 경우(null)일 경우는 로그인 실패

		if("admin".equals(result)) {
			mv.setViewName("redirect:/user_info");
		} else if (result != null) {
			mv.addObject("msg", result + "입니다.");
			mv.setViewName("test");
		}
		else {
			mv.addObject("msg", "존재하지 않는 아이디라고 생각됩니다.");
			mv.setViewName("home");
		}

		return mv;
	}

}
