package org.example;

public class Bowler implements  Cricketer{
    int numberOfBalls;
    String name;
    Coach coach;

    public Bowler(int numberOfBalls, String name, Coach coach) {
        this.numberOfBalls = numberOfBalls;
        this.name = name;
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    @Override
    public void generalInfo() {
        System.out.println("Bowler Info: ");
    }

    @Override
    public String toString() {
        return "Bowler{" +
                "numberOfBalls=" + numberOfBalls +
                ", name='" + name + '\'' +
                ", coach=" + coach +
                '}';
    }
}
