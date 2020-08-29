/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author SpellCaster
 */
public class Beneficiar {
    String phoneNo;
    String name;
    Donation D = new Donation();

    public Beneficiar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void printBeneficiar(){
        System.out.println("PhoneNo: "+phoneNo);
        System.out.println("Name: "+name);
        D.print();
    }
    public Beneficiar(String phoneNo, String name) {
        this.phoneNo = phoneNo;
        this.name = name;
    }

    public Donation getD() {
        return D;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getName() {
        return name;
    }
    
    public void addDonationLoan(Loan L){
        D.addLoan(L);
    }
    public void addDonationGift(Gift G){
        D.addGift(G);
    }
}