package com.asura.accounts.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.asura.accounts.calculator.ReportOne;
import com.asura.accounts.calculator.ReportThree;
import com.asura.accounts.calculator.ReportTwo;
import com.asura.accounts.model.Report;

@Path("/hello")
public class AccountsResource {

	@GET
	@Path("status")
	@Produces(MediaType.TEXT_PLAIN)
	public String getStatus(){

		return "Dheeraj";
	}
	
	@GET
	@Path("/turnover")
	@Produces(MediaType.APPLICATION_JSON)
	public Report getTurnOver(@QueryParam("sales") Double sales,@QueryParam("exciseDuty") Double exciseDuty,@QueryParam("vat") Double vat){
		Double reportOneResult = ReportOne.getTurnOver(sales, exciseDuty, vat);
		Double reportTwoResult = ReportTwo.getTurnOver(sales, exciseDuty, vat);
		Double reportThreeResult = ReportThree.getTurnOver(sales, exciseDuty, vat);

		Report report = new Report(reportOneResult, reportTwoResult, reportThreeResult);
		System.out.println("Report One: "+report.getReportOne());
		System.out.println("Report Two: "+report.getReportTwo());
		System.out.println("Report Three: "+report.getReportThree());
		
		return report;
		
	}
}
