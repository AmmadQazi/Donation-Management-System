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
public class TempDonor {
    int id;
    String donorName;
    String pName;
    int n1;
    int n2;
    int n3;
    int n4;
    int n5;
    int n6;

    public TempDonor(int id, String donorName, String pName, int n1, int n2, int n3, int n4, int n5, int n6) {
        this.id = id;
        this.donorName = donorName;
        this.pName = pName;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
    }
    public void print(){
        System.out.println(id);
        System.out.println(donorName);
        System.out.println(pName);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
    }
}
