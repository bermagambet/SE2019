package com.company;

import java.util.ArrayList;

public class FinancialDepartment {
    private ArrayList collectedData = new ArrayList();

    public void acceptData(String data){
        collectedData.add(data);
    }

    public void showData(){
        for(int i = 0; i < collectedData.size(); i++){
            System.out.println(collectedData.get(i));
        }
    }
}
