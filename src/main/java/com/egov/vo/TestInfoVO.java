package com.egov.vo;

import org.springframework.stereotype.Repository;

@Repository
public class TestInfoVO {

	private Integer tiNum;
	private String tiName;
	
	public Integer getTiNum() {
		return tiNum;
	}
	public void setTiNum(Integer tiNum) {
		this.tiNum = tiNum;
	}
	public String getTiName() {
		return tiName;
	}
	public void setTiName(String tiName) {
		this.tiName = tiName;
	}
	@Override
	public String toString() {
		return "TestVO [tiNum=" + tiNum + ", tiName=" + tiName + "]";
	}	
}
