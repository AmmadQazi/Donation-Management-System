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
public class Food_Collection extends Food {
    
    public Food_Collection(int quantity) {
        super(quantity);
    }
    public int donationcount(){
        return super.quantity;
    }
    public String print(){
        return ("Food quantity collected:\n"+super.quantity);
    }
    
}
