package cn.sz.zl.pojo;

import java.io.Serializable;

public class Loss_Pro implements Serializable{

	private int lossprojectid;
	private int reportid;
	private int policyid;
	private int lossmoney;
	private String report_status;
	private String remarks;
	
	public int getLossprojectid() {
		return lossprojectid;
	}
	public void setLossprojectid(int lossprojectid) {
		this.lossprojectid = lossprojectid;
	}
	public int getReportid() {
		return reportid;
	}
	public void setReportid(int reportid) {
		this.reportid = reportid;
	}
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public int getLossmoney() {
		return lossmoney;
	}
	public void setLossmoney(int lossmoney) {
		this.lossmoney = lossmoney;
	}
	public String getReport_status() {
		return report_status;
	}
	public void setReport_status(String report_status) {
		this.report_status = report_status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
}
