package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class NewContoller {
	
	private static final Logger logger = LoggerFactory.getLogger(NewContoller.class);

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
        logger.info("여기는 콘솔에 찍히는 로그야 다슬");
		return "hello 다슬";
	}

    @RequestMapping(value = "/ppp", method = RequestMethod.GET)
	public String ppp() {
        logger.info("여기는 콘솔에 찍히는 로그야 다슬!!!!!!!!!!!!!!!!!!!!!!!!!");
		return "";
	}
}