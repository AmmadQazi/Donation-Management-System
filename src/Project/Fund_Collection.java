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
public class Fund_Collection extends Fund {

    public Fund_Collection(int Rs) {
        super(Rs);
    }
    public int donationcount(){
        return super.Rs;
    }
    public String print(){
        return ("Fund amount collected:\n"+super.Rs);
    }
}
