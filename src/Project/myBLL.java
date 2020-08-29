/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.Connection;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author SpellCaster
 */
public class myBLL {
    private Organization O;
    private dbConnectivity db = new dbConnectivity();
    public myBLL(){
        db.getAllData();
    }
    public dbConnectivity getdb(){
        return db;
    }
    public void getAllData(){
        O = db.getAllData();
    }
    public Organization getO() {
        return O;
    }
    public void commitProjects(){
        db.commitProjecData(O.getProjects());
    }
    public void commitTeams(){
        db.commitVolunteerData(O.getProjects());
    }
    public int getNewIDofDonor(){
        return(db.getNewIDofDonor());
    }
}