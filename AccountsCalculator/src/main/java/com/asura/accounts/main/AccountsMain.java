package com.asura.accounts.main;

import java.util.Scanner;

import com.asura.accounts.calculator.ReportOne;
import com.asura.accounts.calculator.ReportThree;
import com.asura.accounts.calculator.ReportTwo;
import com.asura.accounts.model.Report;

public class AccountsMain {

	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
	    
		System.out.println("Enter sales value: ");
		Double sales = in.nextDouble();
		
		System.out.println("Sales value entered is "+sales);
		
		System.out.println("Enter exciseDuty value: ");
		Double exciseDuty = in.nextDouble();
		
		System.out.println("Excise Duty value entered is "+exciseDuty+"/n");
		
		System.out.println("Enter vat value: ");
		Double vat = in.nextDouble();
		
		System.out.println("Excise Duty value entered is "+vat);
		
		Double reportOneResult = ReportOne.getTurnOver(sales, exciseDuty, vat);
		Double reportTwoResult = ReportTwo.getTurnOver(sales, exciseDuty, vat);
		Double reportThreeResult = ReportThree.getTurnOver(sales, exciseDuty, vat);

		Report report = new Report(reportOneResult, reportTwoResult, reportThreeResult);
		System.out.println("Report One: "+report.getReportOne());
		System.out.println("Report Two: "+report.getReportTwo());
		System.out.println("Report Three: "+report.getReportThree());
	}

}
