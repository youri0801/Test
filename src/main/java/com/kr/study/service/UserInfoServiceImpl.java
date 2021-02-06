package com.kr.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.dao.UserInfoDao;
import com.kr.study.entity.UserInfoDto;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfoDao dao;

	@Override
	public ModelAndView userInfo() {
		ModelAndView mv = new ModelAndView("user_info");

		List<UserInfoDto> dtoList = dao.userInfo();

		mv.addObject("dtoList", dtoList);

		return mv;
	}

	@Override
	public ModelAndView createUser(UserInfoDto dto) {

		ModelAndView mv = new ModelAndView();

		int result = dao.createUser(dto);

		if(result > 0) {
			mv.setViewName("redirect:/userInfo");
		} else {
			mv.setViewName("failed");
			mv.addObject("msg", "다시 시도해주세요");
		}

		return mv;
	}



	@Override
	public ModelAndView moveModifyUserInfo(String id) {
		ModelAndView mv = new ModelAndView();

		UserInfoDto dto = dao.moveModifyUserInfo(id);

		if(dto.getId() != null) {
			mv.setViewName("modifyUserInfo");
			mv.addObject("dto", dto);
		} else {
			mv.setViewName("failed");
			mv.addObject("msg", "다시 시도해주세요");
		}
		return mv;
	}

	@Override
	public ModelAndView updateUserInfo(UserInfoDto dto) {

		ModelAndView mv = new ModelAndView();

		int result = dao.updateUserInfo(dto);

		if(result > 0) {
			mv.setViewName("redirect:/user_info");
		} else {
			mv.setViewName("failed");
			mv.addObject("msg", "다시 시도해주세요");
		}

		return mv;
	}





}
