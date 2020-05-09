package cn.sz.zl.pojo;

import java.io.Serializable;
import java.math.BigInteger;

public class Up_Loss implements Serializable {
	private BigInteger lossid;	
	private BigInteger reportid;
	private String car_photo;
	private String people_photo;
	private String report_info;
	private String responsibility;
	private String status;

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BigInteger getLossid() {
		return lossid;
	}
	public void setLossid(BigInteger lossid) {
		this.lossid = lossid;
	}
	public BigInteger getReportid() {
		return reportid;
	}
	public void setReportid(BigInteger reportid) {
		this.reportid = reportid;
	}

	public String getCar_photo() {
		return car_photo;
	}
	public void setCar_photo(String car_photo) {
		this.car_photo = car_photo;
	}
	
	public String getPeople_photo() {
		return people_photo;
	}
	public void setPeople_photo(String people_photo) {
		this.people_photo = people_photo;
	}
	public String getReport_info() {
		return report_info;
	}
	public void setReport_info(String report_info) {
		this.report_info = report_info;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	
}

