package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FinancialDepartment fd = new FinancialDepartment();
        Scanner sc1 = new Scanner(System.in);
        int countAD = 0;
        int countMD = 0;
        while(true){
            System.out.println("Enter data, then enter department");
            String input = sc1.nextLine();
            String input2 = sc1.nextLine();
            if ( input2.equals("Accounting Department")){
                AccountingDepartment ad = new AccountingDepartment(countAD, input);
                countAD++;
                System.out.println("Do you want to send the data to Financial Department?");
                String input3 = sc1.nextLine();
                if(input3.equals("Yes")){
                    ad.sendReportToFD(fd);
                }
                else
                if(input3.equals("No")){
                    break;
                }
            }
            else
            if ( input2.equals("Marketing Department")){
                MarketingDepartment md = new MarketingDepartment(countMD, input);
                countMD++;
                System.out.println("Do you want to send the data to Financial Department?");
                String input4 = sc1.nextLine();
                if(input4.equals("Yes")){
                    md.sendReportToFD(fd);
                }
                else
                if(input4.equals("No")){
                    break;
                }
            }
        }
        fd.showData();
    }
}
