/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SpellCaster
 */
public class dbConnectivity {
    Connection con;
    Statement stat;
    public dbConnectivity(){
        
        try{
            String s = "jdbc:sqlserver://localhost:1433;databaseName=lab5";
            con = DriverManager.getConnection(s,"new_user","123");
            stat = (Statement) con.createStatement();
        }
        catch(Exception e){
            
        }
    }
    public Organization getAllData(){
        Organization O = new Non_Profit();
        try{
            String s = "select * from Project";
            ResultSet rs = stat.executeQuery(s);
            while(rs.next()){
                //System.out.println(rs.getString(3));
                Volunteer teamLead = new Volunteer(rs.getString(3), true);
                Volunteer Manager = new Volunteer(rs.getString(5), true);
                Project P = new Project(rs.getString(1),rs.getString(2),teamLead,rs.getInt(4),Manager);
                O.getProjects().add(P);
            }
            s = "select * from Volunteer";
            rs = stat.executeQuery(s);
            
            while(rs.next()){
                
                for (int i = 0;i < O.getProjects().size(); i++){
                    if (rs.getString(1).equals(O.getProjects().get(i).getName())){
                        Volunteer V = new Volunteer(rs.getString(3), true);
                        V.setID(rs.getInt(2));
                        O.getProjects().get(i).getVolunteers().add(V);
                    }
                }
                
            }
            
            s = "select * from GoalsAndObjectives";
            rs = stat.executeQuery(s);
            
            String goals;
            while(rs.next()){
                
                for (int i = 0;i < O.getProjects().size(); i++){
                    if (rs.getString(1).equals(O.getProjects().get(i).getName())){
                        goals = rs.getString(2);
                        O.getProjects().get(i).getGoalsObjectives().add(goals);
                    }
                }
                
            }
            
            s = "select * from Donor";
            rs = stat.executeQuery(s);
            
            while (rs.next()){
                Donor D;
                Loan L;
                Gift G;
                Track T;
                for (int i = 0;i < O.getProjects().size();i++){
                    //System.out.println(rs.getString(3));
                    //System.out.println(O.getProjects().get(i).name);
                    if (rs.getString(3).equalsIgnoreCase(O.getProjects().get(i).name)){
                        T = new Track();
                        D = new Donor (rs.getString(2),rs.getInt(1));
                        T.addDonor(D);
                        //If donor made any cash on loan
                        if (rs.getInt(4)>0){
                            L = new Fund_Collection(rs.getInt(4));
                            T.addLoan(L);
                        }
                        //food on loan
                        if(rs.getInt(5)>0){
                            L = new Food_Collection(rs.getInt(5));
                            T.addLoan(L);
                        }
                        //clothe on loan
                        if(rs.getInt(6)>0){
                            L = new Good_Collection(rs.getInt(6));
                            T.addLoan(L);
                        }
                        //cash as gift
                        if(rs.getInt(7)>0){
                            G = new Fund_Collection(rs.getInt(7));
                            T.addGift(G);
                        }
                        //food as gift
                        if(rs.getInt(8)>0){
                            G = new Food_Collection(rs.getInt(8));
                            T.addGift(G);
                        }
                        //clothe as gift
                        if(rs.getInt(9)>0){
                            G = new Good_Collection(rs.getInt(9));
                            T.addGift(G);
                        }
                        O.getProjects().get(i).Tracks.add(T);
                        O.getProjects().get(i).getDonors().add(D);
                    }
                }
            }
            s = "select * from Beneficiar";
            rs = stat.executeQuery(s);
            Beneficiar B;
            while (rs.next()){
                Loan L;
                Gift G;
                for (int i = 0;i < O.getProjects().size();i++){
                        if (rs.getString(9).equals(O.getProjects().get(i).getName())){
                            for (int j=0;j<O.getProjects().get(i).Tracks.size();j++){
                                //System.out.println(O.getProjects().get(i).Tracks.get(j).D.getName());
                                //System.out.println(rs.getString(10));
                            if (O.getProjects().get(i).Tracks.get(j).D.getName().equalsIgnoreCase((rs.getString(10)))){
  
                                B = new Beneficiar(rs.getString(1),rs.getString(2));
                                O.getProjects().get(i).Tracks.get(j).Beneficiaries.add(B);
                                //System.out.println(B.getName());
                                //Modes how beneficiar drived advantage
                                if (rs.getInt(3)>0){
                                    L = new Fund_Disbursement(rs.getInt(3));
                                    //T.addLoan(L);
                                    //O.getProjects().get(i).Tracks.get(j).Dn.addLoan(L);
                                    B.D.addLoan(L);
                                    //O.getProjects().get(i).Tracks.add(T);
                                }
                                //food on loan
                                if(rs.getInt(4)>0){
                                    L = new Food_Disbursement(rs.getInt(4));
                                    //T.addLoan(L);
                                    //O.getProjects().get(i).Tracks.get(j).Dn.addLoan(L);
                                    //O.getProjects().get(i).Tracks.add(T);
                                    B.D.addLoan(L);
                                }
                                //clothe on loan
                                if(rs.getInt(5)>0){
                                    L = new Good_Disbursement(rs.getInt(5));
                                    //T.addLoan(L);
                                    //O.getProjects().get(i).Tracks.get(j).Dn.addLoan(L);
                                    //O.getProjects().get(i).Tracks.add(T);
                                    B.D.addLoan(L);
                                }
                                //cash as gift
                                if(rs.getInt(6)>0){
                                    G = new Fund_Disbursement(rs.getInt(6));
                                    //O.getProjects().get(i).Tracks.get(j).Dn.addGift(G);
                                    //T.addGift(G);
                                    //O.getProjects().get(i).Tracks.add(T);
                                    B.D.addGift(G);
                                }
                                //food as gift
                                if(rs.getInt(7)>0){
                                    G = new Food_Disbursement(rs.getInt(7));
                                    //O.getProjects().get(i).Tracks.get(j).Dn.addGift(G);
                                    //T.addGift(G);
                                    //O.getProjects().get(i).Tracks.add(T);
                                    B.D.addGift(G);
                                }
                                //clothe as gift
                                if(rs.getInt(8)>0){
                                    G = new Good_Disbursement(rs.getInt(8));
                                    //O.getProjects().get(i).Tracks.get(j).Dn.addGift(G);
                                    //T.addGift(G);
                                    B.D.addGift(G);
                                }
                                //T.addBeneficiar(B);
                                
                                //O.getProjects().get(i).beneficiars.add(B);
                            }
                        }
                    }
                }
            }
            s = "select * from Applicant";
            rs = stat.executeQuery(s);
            Applicant A;
            while(rs.next()){
                A = new Applicant(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(5),rs.getString(6));
                for (int i=0;i<O.getProjects().size();i++){
                    if (rs.getString(6).equals(O.getProjects().get(i).getName())){
                        O.getProjects().get(i).applicants.add(A);
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        return O;
    }
    public void commitProjecData(List<Project>projects){
        try{
            stat.executeQuery("delete from Project");
            //System.out.println(projects.size());
        }
        catch(Exception e){
            //System.out.println(e);
        }
        try{
            for (int i=0;i<projects.size();i++){
                stat.execute("insert into Project values('"+projects.get(i).name+"','"+projects.get(i).description+"','"+projects.get(i).getManagerName()+"',"+projects.get(i).requiredBudget+",'"+projects.get(i).getTeamLeadName()+"')");
                 //stmt.execute("insert into Medicine values("+Medicines.get(i).id+",'"+Medicines.get(i).medName+"',"+Medicines.get(i).medPrice+","+Medicines.get(i).medQuantity+")");
            }
        }
        catch(Exception e){
            
        }
    }
    public void commitVolunteerData(List<Project>projects){
        try{
            stat.executeQuery("delete from Volunteer");
            //System.out.println(projects.size());
        }
        catch(Exception e){
            //System.out.println(e);
        }
        try{
            //System.out.println("Entered");
            for (int i=0;i<projects.size();i++){
                //System.out.println("Entered2");
                for (int j=0;j<projects.get(i).volunteers.size();j++){
                stat.execute("insert into Volunteer values('"+projects.get(i).name+"',"+projects.get(i).volunteers.get(j).id+",'"+projects.get(i).volunteers.get(j).getName()+"',"+0+")");
                 //stmt.execute("insert into Medicine values("+Medicines.get(i).id+",'"+Medicines.get(i).medName+"',"+Medicines.get(i).medPrice+","+Medicines.get(i).medQuantity+")");
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public int getNewIDofDonor(){
        int id=1;
        try{
        String s = "select * from Donor";
            ResultSet rs = stat.executeQuery(s);
            while(rs.next()){
                id = rs.getInt(1);
            }
        }
        catch(Exception e){
            
        }
        id++;
        return id;
    }
    public void commitDonor(int id,String n,String pname,int n1,int n2,int n3,int n4,int n5,int n6){
        try{
            stat.execute("insert into Donor values("+id+",'"+n+"','"+pname+"',"+n1+","+n2+","+n3+","+n4+","+n5+","+n6+")");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void commitApplicant(String n,String add,String pno,int inc,String pname){
        try{
            stat.execute("insert into Applicant values('"+n+"','"+add+"','"+pno+"',"+null+","+inc+",'"+pname+"')");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void shortListApplicant(String n,String phone,String pname,String dname){
        try{
            stat.execute("insert into Beneficiar values('"+phone+"','"+n+"',"+null+","+null+","+null+","+null+","+null+","+null+",'"+pname+"','"+dname+"')");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public List<TempBenficiar> tempBenficiar(){
        List<TempBenficiar>L = new ArrayList();
        TempBenficiar TB;
        try{
            String s = "select * from Beneficiar";
            ResultSet rs = stat.executeQuery(s);
            while(rs.next()){
                TB = new TempBenficiar(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getString(9),rs.getString(10));
                L.add(TB);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return L;
    }
    public List<TempDonor> tempDonor(){
        List<TempDonor>L = new ArrayList();
        TempDonor TD;
        try{
            String s = "select * from Donor";
            ResultSet rs = stat.executeQuery(s);
            while(rs.next()){
                //System.out.println(rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getInt(7)+" "+rs.getInt(8)+" "+rs.getInt(9));
                TD = new TempDonor(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9));
                L.add(TD);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return L;
    }
    public void commitTempBenficiar(List<TempBenficiar>L){
        try{
            stat.executeQuery("delete from Beneficiar");
        }
        catch(Exception e){
            
        }
        try{
            for (int i=0;i<L.size();i++)
                stat.execute("insert into Beneficiar values('"+L.get(i).phone+"','"+L.get(i).bname+"',"+L.get(i).n1+","+L.get(i).n2+","+L.get(i).n3+","+L.get(i).n4+","+L.get(i).n5+","+L.get(i).n6+",'"+L.get(i).pname+"','"+L.get(i).dname+"')");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void commitTempDonor(List<TempDonor>L){
        try{
            stat.executeQuery("delete from Donor");
        }
        catch(Exception e){
            
        }
        try{
            for (int i=0;i<L.size();i++)
                stat.execute("insert into Donor values("+L.get(i).id+",'"+L.get(i).donorName+"','"+L.get(i).pName+"',"+L.get(i).n1+","+L.get(i).n2+","+L.get(i).n3+","+L.get(i).n4+","+L.get(i).n5+","+L.get(i).n6+")");
        }
        catch(Exception e){
            System.out.println(e);
        }    
    }
}