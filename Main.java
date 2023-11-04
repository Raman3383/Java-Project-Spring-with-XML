package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");

        Coach coach = context.getBean(Coach.class);
        coach.instructions();
        System.out.println(" ");

        Batsman batsman = context.getBean(Batsman.class);
        System.out.println(batsman.getCoach());
        batsman.generalInfo();
        System.out.println(batsman);
        System.out.println(" ");

        Bowler bowler = context.getBean(Bowler.class);
        System.out.println(bowler.getCoach());
        bowler.generalInfo();
        System.out.println(bowler);
     }
}