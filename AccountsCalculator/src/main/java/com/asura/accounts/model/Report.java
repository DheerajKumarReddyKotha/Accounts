package com.asura.accounts.model;

public class Report {

	private final Double reportOne;
	private final Double reportTwo;
	private final Double reportThree;
	
	public Report(Double reportOne, Double reportTwo, Double reportThree) {
		super();
		this.reportOne = reportOne;
		this.reportTwo = reportTwo;
		this.reportThree = reportThree;
	}
	public Double getReportOne() {
		return reportOne;
	}
	public Double getReportTwo() {
		return reportTwo;
	}
	public Double getReportThree() {
		return reportThree;
	}
	
	
}
