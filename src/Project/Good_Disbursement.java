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
public class Good_Disbursement extends Good {

    public Good_Disbursement(int quantity) {
        super(quantity);
    }
    public int donationcount(){
        return super.quantity;
    }
    public String print(){
        return ("Goods amount disbursed:\n"+super.quantity);
    }
}
