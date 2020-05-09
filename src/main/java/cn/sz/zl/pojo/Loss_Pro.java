package cn.sz.zl.pojo;

import java.io.Serializable;
import java.math.BigInteger;

public class Loss_Pro implements Serializable{

	private int lossprojectid;
	private BigInteger reportid;
	private int policyid;
	private int losspeople;
	private int losscar;
	private String report_status;
	private String remarks;
	
	public int getLossprojectid() {
		return lossprojectid;
	}
	public void setLossprojectid(int lossprojectid) {
		this.lossprojectid = lossprojectid;
	}
	public BigInteger getReportid() {
		return reportid;
	}
	public void setReportid(BigInteger reportid) {
		this.reportid = reportid;
	}
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public int getLosspeople() {
		return losspeople;
	}
	public void setLosspeople(int losspeople) {
		this.losspeople = losspeople;
	}
	public int getLosscar() {
		return losscar;
	}
	public void setLosscar(int losscar) {
		this.losscar = losscar;
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
