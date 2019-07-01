package com.egov.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.mapper.TestInfoMapper;
import com.egov.service.TestInfoService;
import com.egov.vo.TestInfoVO;

@Service
public class TestInfoServiceImpl implements TestInfoService {
	
	@Resource
	private TestInfoMapper tim;

	@Override
	public List<TestInfoVO> findTestInfoList(TestInfoVO test) {
		return tim.selectTestInfoList(test);
	}

}
