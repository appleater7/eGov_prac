package com.egov.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.egov.vo.TestInfoVO;

@MapperScan
public interface TestInfoMapper {
	public List<TestInfoVO> selectTestInfoList(TestInfoVO test);
}
