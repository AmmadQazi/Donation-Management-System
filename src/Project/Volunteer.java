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
public class Volunteer {
    public static int count=0;
    public String name;
    public int id;
    boolean available;

    public void setID(int id){
        this.id = id;
        count = id;
        count++;
    }
    public void printVolunteer(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.print("Status: ");
        if (available == false){
            System.out.println("Not available");
        }
        else{
            System.out.println("Available");
        }
    }
    public Volunteer(String name, boolean available) {
        this.name = name;
        this.available = available;
        this.id = count;
        count++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return available;
    }
}
