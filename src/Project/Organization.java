/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SpellCaster
 */
public abstract class Organization {
    //private List <Volunteer> volunteers = new ArrayList();    //All time Volunteers
    //private List <Track> tracks = new ArrayList();            //All time Tracks
    private List <Project> projects = new ArrayList();        //All time projects

//    public void setVolunteers(List<Volunteer> volunteers) {
//        this.volunteers = volunteers;
//    }
//
//    public void setTracks(List<Track> tracks) {
//        this.tracks = tracks;
//    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

//    public List<Volunteer> getVolunteers() {
//        return volunteers;
//    }
//
//    public List<Track> getTracks() {
//        return tracks;
//    }

    public List<Project> getProjects() {
        return projects;
    }
    
    
    
    Scanner input = new Scanner(System.in);
    public void addProject(String name, String desc,String manager,int budget,String teamLead){

        Volunteer M = new Volunteer(manager,true);
        Volunteer T = new Volunteer(teamLead,true);
        Project P = new Project(name,desc,M,budget,T);
        projects.add(P);
        
        //String name;
        //String desc;
        //Volunteer manager;
        //String n1;
        //Volunteer teamLead;
        //String n2;
        //int reqBudget;
        
        //System.out.println("Add Name of Project");
        //name = input.next();
        
        //System.out.println("Add Description of Project");
        //desc = input.next();
        
        //System.out.println("Add Manager (Name)");
        //n1 = input.next();
        //manager = new Volunteer(n1,false);
        
//        System.out.println("Add Team Lead");
//        n2 = input.next();
//        teamLead = new Volunteer(n2,false);
        
        //System.out.println("Add Required Budget");
        //reqBudget = input.nextInt();
        
        //Project P = new Project (name,desc,manager,reqBudget);
        
        //projects.add(P);
        
        //All time volunteers of organization
        //volunteers.add(manager);
        //volunteers.add(teamLead);
    }
    public void allocateTeam(){
//        int menu=0;
//        String name;
//        System.out.println("Add name of project/manager of project to add volunteer(s) to");
//        name = input.next();
//        int index = searchProject(name);
//        while(index == -1){
//            System.out.println("No such project found, re-enter information");
//            name = input.next();
//            index = searchProject(name);
//        }
//        
//        while (menu != -1){
//            System.out.println("1.Add Volunteer\n2.Add Team Lead\n-1.Exit");
//            menu = input.nextInt();
//            if (menu == 1){
//                System.out.println("Add Name");
//                name = input.next();
//                Volunteer V = new Volunteer(name,false);
//                volunteers.add(V);
//                projects.get(index).getVolunteers().add(V);
//            }
//            else if (menu == 2){
//                if (projects.get(index).getTeamLead() != null){
//                        System.out.println("There is already a Team Lead in project");
//                }
//                else{
//                    System.out.println("1.To add new Team Lead\n2.To select from existing");
//                    menu = input.nextInt();
//                    if (menu == 1){
//                        System.out.println("Add Name");
//                        name = input.next();
//                        Volunteer V = new Volunteer(name,false);
//                        volunteers.add(V);
//                        System.out.println("Team Lead has been set");
//                        projects.get(index).setTeamLead(V);
//                    }
//                    else if (menu == 2){
//                        
//                        for (int i = 0;i < volunteers.size(); i++){
//                            volunteers.get(i).printVolunteer();
//                        }
//                        int id;
//                        System.out.println("Enter the id of volunteer to make him/her Team Lead");
//                        id = input.nextInt();
//                        if (id < 1 || id > volunteers.size()){
//                            System.out.println("ID is out of bound");
//                        }
//                        else{
//                            System.out.println("Team Lead has been set");
//                            projects.get(index).setTeamLead(volunteers.get(id-1));
//                        }
//                    }
//                }
//            }
//            
//                
//            
//            
//            
//        }
    }
    public String searchBeneficiary(String pno,int option){
        String s="";
        int quantity=0;
        if (projects.size()!=0){
            for (int i=0;i<projects.size();i++){
                for (int j=0;j<projects.get(i).Tracks.size();j++){
                    for (int k=0;k<projects.get(i).Tracks.get(j).Beneficiaries.size();k++)
                    if (projects.get(i).Tracks.get(j).Beneficiaries.get(k).phoneNo.equalsIgnoreCase(pno)){
                        //System.out.println("Entered");
                        s = s + "Project Total:\n" + projtotal(projects.get(i)) + "\n";
                        s = s + "From Project:\n" + projects.get(i).name + "\n";
                        s = s + "Got Donations of worth:\n";
                        for (int z=0;z<projects.get(i).Tracks.get(j).Beneficiaries.get(k).D.Gifts.size();z++){
                            quantity = quantity + projects.get(i).Tracks.get(j).Beneficiaries.get(k).D.Gifts.get(z).donationcount();
                        
                        }
                        for (int z=0;z<projects.get(i).Tracks.get(j).Beneficiaries.get(k).D.Loans.size();z++){
                            quantity = quantity + projects.get(i).Tracks.get(j).Beneficiaries.get(k).D.Loans.get(z).donationcount();
         
                        }
                        s = s + quantity + "\n";
                        s = s + "Beneficiar Name:\n" + projects.get(i).Tracks.get(j).Beneficiaries.get(k).name + "\n";
                        if (option==1){
                            s = s + "Donors of this project:\n";
                            for (int z=0;z<projects.get(i).Tracks.size();z++){
                                s = s + projects.get(i).Tracks.get(z).D.getName() +"\n";
                            }
                        }
                    }
                    quantity = 0;
                }
            }
            
        }
        else{
            s = s + "No projects\n";
        }
           
        return s;
    }
    public int projtotal(Project P){
        int amount=0;
        for (int i=0;i<P.Tracks.size();i++){
            //for (int j=0;j<P.Tracks.get(i).Beneficiaries.size();j++){
//                for (int k=0;k<P.Tracks.get(i).Beneficiaries.get(j).D.Gifts.size();k++){
//                    amount = amount + P.Tracks.get(i).Beneficiaries.get(j).D.Gifts.get(k).donationcount();
//                }
//                
//                for (int k=0;k<P.Tracks.get(i).Beneficiaries.get(j).D.Loans.size();k++){
//                    amount = amount + P.Tracks.get(i).Beneficiaries.get(j).D.Loans.get(k).donationcount();
//                }
//                
                for (int k=0;k<P.Tracks.get(i).Dn.Gifts.size();k++){
                    System.out.println(P.Tracks.get(i).Dn.Gifts.get(k).donationcount());
                    amount = amount + P.Tracks.get(i).Dn.Gifts.get(k).donationcount();
                }
                
                for (int k=0;k<P.Tracks.get(i).Dn.Loans.size();k++){
                    System.out.println(P.Tracks.get(i).Dn.Gifts.get(k).donationcount());
                    amount = amount + P.Tracks.get(i).Dn.Loans.get(k).donationcount();
                }
            //}
        }
        return amount;
    }
    public String issueDonation(List<TempBenficiar> TB,List<TempDonor> TD,String phone,String donor,int n1,int n2,int n3,int n4,int n5,int n6,String project){
        String s = "";
        boolean check = false;
        boolean check1 = false;
        boolean check2 = false;
                     for (int i=0;i<TB.size();i++){
                         if (TB.get(i).phone.equalsIgnoreCase(phone)){
                             check=true;
                             for (int j=0;j<TD.size();j++){
                                 if (TD.get(j).donorName.equalsIgnoreCase(donor)){
                                     int index=j;
                                     check1=true;
                                     for (int k=0;k<TB.size();k++){
                                         if (TB.get(k).pname.equalsIgnoreCase(project)){
                                             check2 = true;
                                             //Time to issue donation
                                             //System.out.println(TD.get(k).n1+" "+TD.get(k).n2+" "+TD.get(k).n3+" "+TD.get(k).n4+" "+TD.get(k).n5+" "+TD.get(k).n6);
                                             //System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
                                             if (TD.get(index).n1>=n1 && TD.get(index).n2>=n2 && TD.get(index).n3>=n3 && TD.get(index).n4>=n4 && TD.get(index).n5>=n5 && TD.get(index).n6>=n6){
                                                 TB.get(k).n1 = TB.get(k).n1 + n1;
                                                 TD.get(index).n1 = TD.get(index).n1 - n1;
                                                 
                                                 TB.get(k).n2 = TB.get(k).n2 + n2;
                                                 TD.get(index).n2 = TD.get(index).n2 - n2;
                                                 
                                                 TB.get(k).n3 = TB.get(k).n3 + n3;
                                                 TD.get(index).n3 = TD.get(index).n3 - n3;
                                                 
                                                 TB.get(k).n4 = TB.get(k).n4 + n4;
                                                 TD.get(index).n4 = TD.get(index).n4 - n4;
                                                 
                                                 TB.get(k).n5 = TB.get(k).n5 + n5;
                                                 TD.get(index).n5 = TD.get(index).n5 - n5;
                                                 
                                                 TB.get(k).n6 = TB.get(k).n6 + n6;
                                                 TD.get(index).n6 = TD.get(index).n6 - n6;
                                                 
                                                 s = s + "Transaction successful\n Money has been shifted to applicant who is now a benficiar\n";
                                                 break;
                                             }
                                             else{
                                                 s = s + "DONATION UNSUCCESSFUL!!!\nOne of more donation value was not sufficienlty present to be donated\n";
                                             }
                                         }
                                     }
                                     if (check2==false){
                                         System.out.println("Applicant did not apply for this project\n");
                                     }
                                 }
                                 
                             }
                             if (check1==false){
                                 s = s + "No such donor found\n";
                             }
                             
                         }
                         
                     }
                     if (check==false){
                        s = s + "No such applicant found\n";
                     }
        return s;
    }
    public String shortListApplicant(String n,String phone,String pname,String dname){
        String s="Unsuccessful";
        dbConnectivity db = new dbConnectivity();
        if (projects.size()!=0){
            for (int i=0;i<projects.size();i++){
                if (projects.get(i).getName().equalsIgnoreCase(pname)){
                    db.shortListApplicant(n, phone, pname, dname);
                    s = "Successful\n";
                }
            }
        }
        return s;
    }
    public void addApplicant(String name,String add,String pno,int inc,String pname){
        dbConnectivity db = new dbConnectivity();
        if (projects.size()!=0){
            for (int i=0;i<projects.size();i++){
                if (projects.get(i).getName().equalsIgnoreCase(pname)){
                    db.commitApplicant(name, add, pno, inc, pname);
                }
            }
        }
        else{
            
        }
    }
    public void addDonor(int id,String n,String pname,int n1,int n2,int n3,int n4,int n5,int n6){
        dbConnectivity db = new dbConnectivity();
        if (projects.size()!=0){
            for (int i=0;i<projects.size();i++){
                if (projects.get(i).getName().equalsIgnoreCase(pname)){
                    db.commitDonor(id, n, pname, n1, n2, n3, n4, n5, n6);
                }
            }
        }
        else{
            
        }
        
    }
    public void add(String m,String p){
        Volunteer V=null;
        if (projects.size()!=0){
            for (int i=0;i<projects.size();i++){
                if(projects.get(i).name.equalsIgnoreCase(p)){
                    V = new Volunteer(m,true);
                    projects.get(i).volunteers.add(V);
                }
            }
        }
        else{
            
        }
    }
    public void remove(String m,String p){
        if (projects.size()!=0){
            for (int i=0;i<projects.size();i++){
                if(projects.get(i).name.equalsIgnoreCase(p)){
                    for (int j=0;j<projects.get(i).volunteers.size();j++){
                        if (projects.get(i).volunteers.get(j).name.equalsIgnoreCase(m)){
                            projects.get(i).volunteers.remove(j);
                        }
                    }
                }
            }
        }
        else{
            
        }
    }
    public String replace(int id1,int id2,String p){
        String s = "";
        boolean check1 = false;
        boolean check2 = false;
        int index1 = 0;
        int index2 = 0;
        if (projects.size()!=0){
            for (int i=0;i<projects.size();i++){
                if(projects.get(i).name.equalsIgnoreCase(p)){
                    if (projects.get(i).teamLead.id==id1){
                            check1 = true;
                            index1 = i;
                        for (int j=0;j<projects.get(i).volunteers.size();j++){
                            if (projects.get(i).volunteers.get(j).id==id2){
                                check2 = true;
                                index2 = j;
                            }
                        }
                        if (check1 == true && check2 == true){
                                projects.get(index1).teamLead.id = projects.get(i).volunteers.get(index2).id;
                                projects.get(index1).teamLead.name = projects.get(i).volunteers.get(index2).name;
                                projects.get(i).volunteers.remove(index2);
                                s = s + "successful\n";
                                dbConnectivity db = new dbConnectivity();
                                db.commitProjecData(projects);
                                db.commitVolunteerData(projects);
                        }
                        
                    }
                
                }
            }
        }
        else{
            s = "Unsucessful\n";
        }
        if (check1==false || check2==false){
            s = "Unsuccessful\n";
        }
        return s;
    }
    public void addTeamLead(String m,String p){
        Volunteer V=null;
        if (projects.size()!=0){
            for (int i=0;i<projects.size();i++){
                if(projects.get(i).name.equalsIgnoreCase(p)){
                    V = new Volunteer(m,true);
                    projects.get(i).teamLead = V;
                }
            }
        }
        else{
            
        }
    }
    public void addTeamMember(String m,String p){
        Volunteer V=null;
        if (projects.size()!=0){
            for (int i=0;i<projects.size();i++){
                if(projects.get(i).name.equalsIgnoreCase(p)){
                    V = new Volunteer(m,true);
                    projects.get(i).volunteers.add(V);
                }
            }
        }
        else{
            
        }
    }
    public String searchProject(String name){
        String s = "";
            if (projects.size()!=0){
                for (int i = 0;i < projects.size(); i++){
                    if (projects.get(i).getName().equalsIgnoreCase(name) || projects.get(i).getManagerName().equalsIgnoreCase(name)){
                            s = s + "Project Name:\n" + projects.get(i).name + "\nManager:\n" + projects.get(i).getManagerName() +"\nDescription:\n" + projects.get(i).getDescription() +"\nVolunteers:\n";
                            if (projects.get(i).volunteers.size()==0){
                                s = s + "No volunteers\n";
                            }
                            else{
                                for (int j=0;j<projects.get(i).volunteers.size();j++){
                                    s = s + "ID: "+projects.get(i).volunteers.get(j).id +"\n";
                                    s = s + "Name: "+projects.get(i).volunteers.get(j).name + "\n";
                                }
                            }
                            s = s + "Donors:\n";
                            if (projects.get(i).getDonors().size()==0){
                                s = s +"No Donors in this project yet\n";
                            }
                            else{
                                for (int j=0;j<projects.get(i).getDonors().size();j++){
                                    s = s + "Name: "+projects.get(i).getDonors().get(j).getName() +"\n";
                                }
                            }
                            s = s + "TeamLead:\n";
                            if (projects.get(i).teamLead==null){
                                s = s + "No TeamLead\n";
                            }
                            else{
                                s = s + projects.get(i).teamLead.getName() + "\n";
                            }
                            s = s + "Beneficiars:\n";
                            if (projects.get(i).Tracks.size()==0){
                                s = s + "No beneficiars as of yet\n";
                            }
                            else{
                                for (int j=0;j<projects.get(i).Tracks.size();j++){
                                    for (int k=0;k<projects.get(i).Tracks.get(j).Beneficiaries.size();k++){
                                    s = s + "Name:\n" + projects.get(i).Tracks.get(j).getBeneficiaries().get(k).name + "\nPhoneNo:\n" + projects.get(i).Tracks.get(j).getBeneficiaries().get(k).phoneNo+"\n";
                                    s = s + "Donations Received:\n";    
                                    if (projects.get(i).Tracks.get(j).getBeneficiaries().get(k).D!=null){
                                        s = s + "As Gift:\n";
                                        if (projects.get(i).Tracks.get(j).getBeneficiaries().get(k).D.getGifts().size()!=0){
                                        for (int z=0;z<projects.get(i).Tracks.get(j).getBeneficiaries().get(k).D.getGifts().size();z++){
                                            s = s + projects.get(i).Tracks.get(j).getBeneficiaries().get(k).D.getGifts().get(z).print() + "\n";
                                        }
                                        }
                                        else{
                                            
                                        }
                                        s = s + "As Loan:\n";
                                        if(projects.get(i).Tracks.get(j).getBeneficiaries().get(k).D.getLoans().size()!=0){
                                        for (int z=0;z<projects.get(i).Tracks.get(j).getBeneficiaries().get(k).D.getLoans().size();z++){
                                            s = s + projects.get(i).Tracks.get(j).getBeneficiaries().get(k).D.getLoans().get(z).print() + "\n";
                                        }
                                        }
                                        else{
                                            
                                        }
                                    }
                                    
                                }
                            }
                    }
                }
            }
            }
            else{
                return ("No projects in organization for now");
            }
        return s;
    }
    public String searchDonor(String name, int option){
        String s="";
            int quantity=0;
            int amount=0;
            if (projects.size()!=0){
                for (int i=0;i<projects.size();i++){
                    for (int j=0;j<projects.get(i).Tracks.size();j++){
                        quantity=0;
                        if (projects.get(i).Tracks.get(j).D.getName().equalsIgnoreCase(name)){
                            s = s + "Donor:\n" + projects.get(i).Tracks.get(j).D.getName() + "\n";
                            s = s + "Project:\n" + projects.get(i).name + "\n";
                            s = s + "Project Total:\n" + projtotal(projects.get(i)) + "\n";
//                            if (projects.get(i).Tracks.get(j).Dn!=null){
//                                s = s + "Donations Total:\n";
//                                if (projects.get(i).Tracks.get(j).Dn.Gifts.size()!=0){
//                                    //s = s + "Gifts:\n";
//                                    for (int k=0;k<projects.get(i).Tracks.get(j).Dn.Gifts.size();k++){
//                                        //System.out.println(projects.get(i).Tracks.get(j).Dn.Gifts.get(k).donationcount());
//                                        quantity = quantity + projects.get(i).Tracks.get(j).Dn.Gifts.get(k).donationcount();
//                           
//                                    }
//                                }
//                                else{
//                                    
//                                }
//                                if (projects.get(i).Tracks.get(j).Dn.Loans.size()!=0){
//                                    //s = s + "Loans:\n";
//                                    for (int k=0;k<projects.get(i).Tracks.get(j).Dn.Loans.size();k++){
//                                        //System.out.println(projects.get(i).Tracks.get(j).Dn.Gifts.get(k).donationcount());
//                                        quantity = quantity + projects.get(i).Tracks.get(j).Dn.Loans.get(k).donationcount();
//                                    }
//                                }
//                                
//                            }
//                            if (quantity!=0){
//                                s = s + quantity + "\n";
//                                quantity=0;
//                            }
                            if (option==1){
                            if (projects.get(i).Tracks.get(j).Beneficiaries.size()!=0){
                                s = s + "Beneficiaries:\n";
                                for (int k=0;k<projects.get(i).Tracks.get(j).Beneficiaries.size();k++){
                                    s = s +"Name:\n"+ projects.get(i).Tracks.get(j).Beneficiaries.get(k).name + "\nPhone:\n" +projects.get(i).Tracks.get(j).Beneficiaries.get(k).phoneNo + "\n";
                                    if (projects.get(i).Tracks.get(j).Beneficiaries.get(k).getD().Gifts.size()!=0){
                                        s = s + "Donations as Gifts:\n";
                                        for (int z=0;z<projects.get(i).Tracks.get(j).Beneficiaries.get(k).getD().Gifts.size();z++){
                                            s = s + projects.get(i).Tracks.get(j).Beneficiaries.get(k).getD().Gifts.get(z).print() + "\n";
                                            quantity = quantity + projects.get(i).Tracks.get(j).Beneficiaries.get(k).getD().Gifts.get(z).donationcount();
                                        }
                                    }
                                    else{
                                        
                                    }
                                    if (projects.get(i).Tracks.get(j).Beneficiaries.get(k).getD().Loans.size()!=0){
                                        s = s + "Donations as Loans:\n";
                                        for (int z=0;z<projects.get(i).Tracks.get(j).Beneficiaries.get(k).getD().Loans.size();z++){
                                            s = s + projects.get(i).Tracks.get(j).Beneficiaries.get(k).getD().Loans.get(z).print() + "\n";
                                            quantity = quantity + projects.get(i).Tracks.get(j).Beneficiaries.get(k).getD().Loans.get(z).donationcount();
                                        }
                                    }
                                    else{
                                        
                                    }
                                    s = s + "Donations Total:\n";
                                    s = s + quantity + "\n";
                                    //amount = amount + quantity;
                                    quantity = 0;
                                }
                            }
                            else {
                                s = s + "No beneficiar of this donor yet\n";
                            }
                            }
                        }
                    }
                }
            }
            else{
                s = s + "No projects so there will be no donors\n";
            }
                
        return s;
    }
    public void printProjects(){
//        for (int i = 0;i < projects.size(); i++){
//            System.out.println("Project Details:");
//            System.out.println("Name: "+projects.get(i).getName());
//            System.out.println("Manager: "+projects.get(i).getManagerName());
//            System.out.println("Team Lead: "+projects.get(i).getTeamLeadName());
//            System.out.println("Volunteers:");
//            for (int j = 0;j < projects.get(i).volunteers.size();j++){
//                projects.get(i).volunteers.get(j).printVolunteer();
//            }
//            System.out.println("Goals/Objectives:");
//            for (int k = 0;k < projects.get(i).goalsObjectives.size();k++){
//                System.out.println((k+1)+": "+projects.get(i).goalsObjectives.get(k));
//            }
//            System.out.println("Donors:");
//            for (int l = 0; l < projects.get(i).getDonors().size();l++){
//                projects.get(i).getDonors().get(l).print();
//                System.out.println("Donations of "+projects.get(i).getDonors().get(l).getName()+":");
//                if (projects.get(i).getDonation().getGifts().size()!=0){
//                    System.out.println("As Gifts");
//                    for (int j=0;j<projects.get(i).getDonation().getGifts().size();j++){
//                        projects.get(i).getDonation().getGifts().get(j).print();
//                    }
//                }
//                else{
//                    System.out.println("No donation as gift");
//                }
//                if (projects.get(i).getDonation().getLoans().size()!=0){
//                    System.out.println("As Loans");
//                    for (int j=0;j<projects.get(i).getDonation().getLoans().size();j++){
//                        projects.get(i).getDonation().getLoans().get(j).print();
//                    }
//                }
//                else{
//                    System.out.println("No donation as Loan");
//                }
//            }
//            if (projects.get(i).beneficiars.size()!=0){
//                System.out.println("Beneficiaries");
//                projects.get(i).beneficiars.get(i).printBeneficiar();
//            }
//            else{
//                System.out.println("No beneficiars of this project yet");
//            }
//            if (projects.get(i).applicants.size()!=0){
//                System.out.println("Applicants");
//                for (int j=0;j<projects.get(i).applicants.size();j++){
//                    projects.get(i).applicants.get(j).print();
//                }
//            }
//            System.out.println("");
//        }
    }
    public void shortListApplicants(){
        int select=0;
        if (projects.size()!=0){
            while (select!=-1){
                for (int i=0;i<projects.get(i).applicants.size();i++){
                    System.out.println(i+1+":");
                        projects.get(i).applicants.get(i).print();
                            System.out.println("1. Select Applicant by no displayed\n2. -1 To Exit");
                                select = input.nextInt();
                                    if (select == 1){
                                            System.out.println("Enter the display number");
                                                select = input.nextInt();
                                                if (select > 0 && select <=projects.get(i).applicants.size()){
                                            System.out.println("Ok");
                                            }
                                    else{
                                    System.out.println("Not Ok");
                                    }
                            }
                        }
                    }
                }
    }
    public void editTeamMember(){
//        String name;
//        System.out.println("Enter the name of project");
//        name = input.next();
//        //int index = searchProject(name);
//        while(index == -1){
//            System.out.println("No such project found, re-enter information");
//            name = input.next();
//            //index = searchProject(name);
//        }
//        int menu = 0;
//        
//        while (menu!=-1){
//            System.out.println("Volunteers:");
//            for (int j = 0;j < projects.get(index).volunteers.size();j++){
//                projects.get(index).volunteers.get(j).printVolunteer();
//            }
//            System.out.println("1.Add Volunteer\n2.Remove Volunteer\n3.Replace Volunteer\n4.Add Team Lead\n-1 to Exit");
//            menu = input.nextInt();
//            if (menu == 1){
//                System.out.println("Add Name");
//                name = input.next();
//                Volunteer V = new Volunteer(name,false);
//                volunteers.add(V);
//                projects.get(index).getVolunteers().add(V);
//                
//            }
//            else if (menu == 2){
//                boolean check = false;
//                System.out.println("Enter the name of volunteer to be removed");
//                name = input.next();
//                if (projects.get(index).getVolunteers() != null){
//                    for (int i = 0;i < projects.get(index).getVolunteers().size(); i++){
//                        if (projects.get(index).getVolunteers().get(i).getName().equalsIgnoreCase(name)){
//                            System.out.println("Removed Volunteer");
//                            projects.get(index).getVolunteers().remove(i);
//                            check = true;
//                        }
//                    }
//                }
//                else{
//                    System.out.println("No more volunteers in this project");
//                }
//                if (check == false)
//                    System.out.println("No such volunteer found");
//            }
//            else if (menu == 3){
//                System.out.println("Enter the name of volunteer to replace");
//                name = input.next();
//                //int id1 = searchProject(name);
//                while (id1 == -1){
//                    for (int i = 0;i < projects.get(index).getVolunteers().size();i++){
//                        if (projects.get(index).getVolunteers().get(i).getName().equalsIgnoreCase(name)){
//                            id1 = i;
//                        }
//                    }
//                    if (id1 == -1){
//                        System.out.println("Enter a valid name");
//                        name = input.next();
//                    }
//                        
//                }
//                System.out.println("Enter the new volunteer name");
//                name = input.next();
//                Volunteer V = new Volunteer(name,false);
//                volunteers.add(V);
//                System.out.println("Volunteer replaced with new one");
//                projects.get(index).getVolunteers().set(id1, V);
//            }
//            else if (menu == 4){
//                if (projects.get(index).getTeamLead() != null){
//                        System.out.println("There is already a Team Lead in project");
//                }
//                else{
//                    System.out.println("1.To add new Team Lead\n2.To select from existing");
//                    menu = input.nextInt();
//                    if (menu == 1){
//                        System.out.println("Add Name");
//                        name = input.next();
//                        Volunteer V = new Volunteer(name,false);
//                        volunteers.add(V);
//                        System.out.println("Team Lead has been set");
//                        projects.get(index).setTeamLead(V);
//                    
//                    }
//                    else if (menu == 2){
//                    
//                        for (int i = 0;i < volunteers.size(); i++){
//                            volunteers.get(i).printVolunteer();
//                        }
//                        int id;
//                        System.out.println("Enter the id of volunteer to make him/her Team Lead");
//                        id = input.nextInt();
//                        if (id < 1 || id > volunteers.size()){
//                            System.out.println("ID is out of bound");
//                        }
//                        else{
//                            System.out.println("Team Lead has been set");
//                            projects.get(index).setTeamLead(volunteers.get(id-1));
//                        }
//                    }
//                }
//            }
//        }
    }
}