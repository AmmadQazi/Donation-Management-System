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
public class Donor {
    private static int count = 0;
    private int id;
    private String name;
    public Donor(String name){
        this.name = name;
        this.id = count;
        count++;
    }
    public String getName(){
        return name;
    }
    public Donor(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void setID(int id){
        this.id = id;
        count = id;
        count++;
    }
    public void print(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}