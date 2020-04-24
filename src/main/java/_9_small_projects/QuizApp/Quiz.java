package _9_small_projects.QuizApp;

import java.util.Scanner;

public class Quiz {
    run(Quiz quiz){

        System.out.println("Welcome to our quiz!");
        System.out.println("REGISTRATION: ");
        System.out.println("Please enter your name: ");
        Scanner scan = new Scanner (System.in);
        String name = scan.nextLine();
        System.out.println("Confirmation of name registery: "+name);
        System.out.println("Please enter your last name: ");
        String lastName = scan.nextLine();


        if(participant.isPresent()){
            System.out.println(participant.get().getName());
        }
    }
}
