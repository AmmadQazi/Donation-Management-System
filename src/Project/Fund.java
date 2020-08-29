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
public abstract class Fund implements Gift,Loan {
    int Rs;
    public Fund(int Rs){
        this.Rs = Rs;
    }
    public abstract int donationcount();
    
}
