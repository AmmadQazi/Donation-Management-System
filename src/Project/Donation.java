/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SpellCaster
 */
public class Donation {
    public List<Gift>Gifts = new ArrayList();
    public List<Loan>Loans = new ArrayList();
    public void addGift(Gift G){
        Gifts.add(G);
    }
    public void addLoan(Loan L){
        Loans.add(L);
    }

    public List<Gift> getGifts() {
        return Gifts;
    }

    public List<Loan> getLoans() {
        return Loans;
    }
    public void print(){
        if (Gifts.size()!=0){
            System.out.println("Gifts Details");
            for (int i=0;i<Gifts.size();i++){
                Gifts.get(i).print();
            }
        }
        
        if (Loans.size()!=0){
            System.out.println("Loans Details");
            for (int i=0;i<Loans.size();i++){
                Loans.get(i).print();
            }
        }
    }
}