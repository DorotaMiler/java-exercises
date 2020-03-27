package _9_small_projects.EnumApp;

import java.util.Scanner;

public class RunMathOperations {

    public void viewMathOpearations() {
        System.out.println("------------------------------------------------------");
        System.out.println("-----  Available math operations (in enum form): -----\n");
        System.out.println("***    1. Add ( + )                                ***");
        System.out.println("***    2. Substract ( - )                          ***");
        System.out.println("***    3. Multiply ( * )                           ***");
        System.out.println("***    4. Devide ( / )                             ***");
        System.out.println("-------------------------------------------------------");
    }

    public void chooseMathOperation() throws ZeroValueException {
        System.out.println("Please choose from the below available 4 options:");
        boolean isCorrectOption = false;
        viewMathOpearations();
        while (!isCorrectOption) {
            int chosenOption = getConsoleInput();
            switch (chosenOption) {
                case 0:
                    break;
                case 1:
                    System.out.println("Choice confirmation: " + MathOperations.ADD.getOptionNumber() + " implies -> " + MathOperations.ADD.getSign());
                    break;
                case 2:
                    System.out.println("Choice confirmation: " + MathOperations.SUBTRACT.getOptionNumber() + " implies -> " + MathOperations.SUBTRACT.getSign());
                    break;
                case 3:
                    System.out.println("Choice confirmation: " + MathOperations.MULTIPLY.getOptionNumber() + " implies -> " + MathOperations.MULTIPLY.getSign());
                    break;
                case 4:
                    System.out.println("Choice confirmation: " + MathOperations.DEVIDE.getOptionNumber() + " implies -> " + MathOperations.DEVIDE.getSign());
                    break;
                default:
                    System.out.println("Chosen option incorrect -> please try again (choose integer ranging from 1 - 4)");
            }
            isCorrectOption = (chosenOption >= 5 || chosenOption < 0) ? false : true;

        }
    }

    public int getConsoleInput() {
        Scanner scan = new Scanner(System.in);
        int chosenOption = scan.nextInt();
        return chosenOption;
    }
}