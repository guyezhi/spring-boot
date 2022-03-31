package com.guyu.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yu.gu
 * @description
 * @date 2022/3/30 下午10:52
 */
@RestController
@RequestMapping("/")
public class TestController {

	@GetMapping("/test")
	public Object test() {
		return "Hello World";
	}

	@GetMapping("/testParam/{param}")
	public Object testParam(@PathVariable("param") String param) {
		// logger.info("test请求参数" + param);
		return "Hello " + param;
	}
}
