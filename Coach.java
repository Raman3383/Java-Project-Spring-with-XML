package org.example;

public class Coach {
    String coachName;
    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public void instructions(){
        System.out.println("Instructions by the Coach : ");
        System.out.println("Don't be lazy, practice Daily for 12 hours:");
    }

    @Override
    public String toString() {
        return "Coach{" +
                "Coach  Name=" + coachName + '\'' + '}';
    }
}
