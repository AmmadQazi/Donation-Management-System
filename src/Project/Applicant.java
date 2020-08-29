/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.util.Date;

/**
 *
 * @author SpellCaster
 */
public class Applicant {
    String name;
    String address;
    String phoneNo;
    int income;
    String projectName;
    //Date dob;

    public void print(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("PhoneNo: "+phoneNo);
        System.out.println("Income: "+income);
        System.out.println("Applied for: "+projectName);
    }
    public Applicant(String name, String address, String phoneNo, int income, String projectName) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.income = income;
        this.projectName = projectName;
    }
    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public int getIncome() {
        return income;
    }

    public String getProjectName() {
        return projectName;
    }
    
    
}
