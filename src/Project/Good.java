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
public abstract class Good implements Gift,Loan{
    int quantity;
    public Good(int quantity) {
        this.quantity = quantity;
    }
    public abstract int donationcount();
}
