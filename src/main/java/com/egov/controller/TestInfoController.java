package com.egov.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.egov.service.TestInfoService;
import com.egov.vo.TestInfoVO;

@Controller
public class TestInfoController {

	@Resource
	private TestInfoService tis;
	
	@GetMapping("/testinfo.do")
	public @ResponseBody List<TestInfoVO> test(TestInfoVO test) {
		List<TestInfoVO> abc = tis.findTestInfoList(null);
		System.out.println(abc);
		return abc;
	}
}
