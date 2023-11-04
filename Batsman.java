package org.example;

public class Batsman implements Cricketer{
    int numberOfMatches;
    String batsmanName;
    int age;
    Coach coach;

    public Coach getCoach() {
        return coach;
    }

    public Batsman(int numberOfMatches, String batsmanName, int age, Coach coach) {
        this.numberOfMatches = numberOfMatches;
        this.batsmanName = batsmanName;
        this.age = age;
        this.coach = coach;
    }

    @Override
    public void generalInfo() {
        System.out.println("Batsman Info : ");
    }

    @Override
    public String toString() {
        return "Batsman{" +
                "numberOfMatches=" + numberOfMatches +
                ", batsmanName='" + batsmanName + '\'' +
                ", age=" + age +
                ", coach=" + coach +
                '}';
    }
}
