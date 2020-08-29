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
public class Track {
    //Project P;
    List <Beneficiar> Beneficiaries = new ArrayList();
    Donor D;
    String pledge;
    Donation Dn = new Donation();
    public void addBeneficiar(Beneficiar B){
        Beneficiaries.add(B);
    }
    public void addDonor(Donor D){
        this.D = D;
    }
    public List<Beneficiar> getBeneficiaries() {
        return Beneficiaries;
    }
    public Donor getDonor(){
        return D;
    }
    public Donation getDonation(){
        return Dn;
    }
    public void addLoan(Loan L){
        Dn.addLoan(L);
    }
    public void addGift(Gift G){
        Dn.addGift(G);
    }
}