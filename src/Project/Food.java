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
public abstract class Food implements Loan,Gift {
    int quantity;
    public Food(int quantity){
        this.quantity = quantity;
    }
    public abstract int donationcount();
}
