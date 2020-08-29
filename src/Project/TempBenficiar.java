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
public class TempBenficiar {
        String phone;
        String bname;
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        String pname;
        String dname;

    public TempBenficiar(String phone, String bname, int n1, int n2, int n3, int n4, int n5, int n6, String pname, String dname) {
        this.phone = phone;
        this.bname = bname;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
        this.pname = pname;
        this.dname = dname;
    }
    public void print(){
        System.out.println(phone);
        System.out.println(bname);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(pname);
        System.out.println(dname);
    }
}
