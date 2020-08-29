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
public class Fund_Disbursement extends Fund {

    public Fund_Disbursement(int Rs) {
        super(Rs);
    }
    public int donationcount(){
        return super.Rs;
    }
    public String print(){
        return ("Fund amount disbursed:\n"+super.Rs);
    }
}
