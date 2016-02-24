package com.fz.chainOfResponsibility;

/**
 * 请假的基本信息
 * @author FZ
 * @version 1.0  2015年11月13日 下午3:59:05
 */
public class LeaveRequest {
	private String empName;//请假人
	private int leaveDays;//请假天数
	private String reason;//请假理由
	
	public LeaveRequest(String empName, int leaveDays, String reason) {
		super();
		this.empName = empName;
		this.leaveDays = leaveDays;
		this.reason = reason;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
