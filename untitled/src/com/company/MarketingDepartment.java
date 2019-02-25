package com.company;

public class MarketingDepartment extends Department{
    private int reportNumber;
    private String data;
    MarketingDepartment(int reportNumber, String data){
        this.data = data;
        this.reportNumber = reportNumber;
    }
    public void sendReportToFD(Object obj){
        if (obj instanceof FinancialDepartment){
            ((FinancialDepartment)obj).acceptData(this.data);
        }
        else
            System.out.println("Something gone wrong");
    }
}
