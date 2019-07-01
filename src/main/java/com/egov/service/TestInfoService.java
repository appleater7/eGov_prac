package com.egov.service;


import java.util.List;

import com.egov.vo.TestInfoVO;

public interface TestInfoService {

	public List<TestInfoVO> findTestInfoList(TestInfoVO test);
}
