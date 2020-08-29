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
public class Project {
    String name;
    String description;
    Volunteer manager;
    Volunteer teamLead;
    int requiredBudget;
    List <Donor> donors = new ArrayList();    //Donors of project
    List <Volunteer> volunteers = new ArrayList();    //People working on project
    List <String> goalsObjectives = new ArrayList(); //Goals and objectives of project
    List <Interview> interviews = new ArrayList(); //Interviews conducted for project
    List <Beneficiar> beneficiars = new ArrayList(); 
    //Donation D = new Donation();
    List <Track> Tracks = new ArrayList();
    List <Applicant> applicants = new ArrayList();
    public void printApplicants(){
        for (int i=0;i<applicants.size();i++){
            applicants.get(i).print();
        }
    }
    public void addTrack(Track T){
        this.Tracks.add(T);
    }
    public Project(String name, String description, Volunteer manager, int requiredBudget, Volunteer teamLead) {
        this.name = name;
        this.description = description;
        this.manager = manager;
        this.requiredBudget = requiredBudget;
        this.teamLead = teamLead;
    }
    
    public List<Volunteer> getVolunteers() {
        return volunteers;
    }
    public String getName(){
        return name;
    }
    public String getManagerName(){
        return manager.getName();
    }

    public String getDescription() {
        return description;
    }

    public Volunteer getManager() {
        return manager;
    }

    public Volunteer getTeamLead() {
        if (teamLead != null)
            return teamLead;
        return null;
    }

    public int getRequiredBudget() {
        return requiredBudget;
    }

    public List<Donor> getDonors() {
        return donors;
    }

    public List<String> getGoalsObjectives() {
        return goalsObjectives;
    }

    public List<Interview> getInterviews() {
        return interviews;
    }

//    public List<Activity> getLoans() {
//        return loans;
//    }
//
//    public List<Activity> getGifts() {
//        return gifts;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setManager(Volunteer manager) {
        this.manager = manager;
    }

    public void setTeamLead(Volunteer teamLead) {
        this.teamLead = teamLead;
    }

    public void setRequiredBudget(int requiredBudget) {
        this.requiredBudget = requiredBudget;
    }

//    public void setDonors(List<Donor> donors) {
//        this.donors = donors;
//    }

    public void setVolunteers(List<Volunteer> volunteers) {
        this.volunteers = volunteers;
    }

    public void setGoalsObjectives(List<String> goalsObjectives) {
        this.goalsObjectives = goalsObjectives;
    }

    public void setInterviews(List<Interview> interviews) {
        this.interviews = interviews;
    }

//    public void setLoans(List<Activity> loans) {
//        this.loans = loans;
//    }
//
//    public void setGifts(List<Activity> gifts) {
//        this.gifts = gifts;
//    }
    public String getTeamLeadName(){
        if (teamLead!=null)
            return teamLead.getName();
        return null;
    }
}
