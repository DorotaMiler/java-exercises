package _9_small_projects.EnumApp;

import java.util.Scanner;

public enum MathOperations {
    ADD(1, "+"),
    SUBSTRACT(2, "-"),
    MULTIPLY(3, "*"),
    DEVIDE(4, "/");

    private String sign;
    private Integer optionNumber;

    MathOperations(Integer optionNumber, String sign) {
        this.optionNumber = optionNumber;
        this.sign = sign;
    }

    public void viewMathOpearations() {
        System.out.println("------------------------------------------------------");
        System.out.println("-----  Available math operations (in enum form): -----\n");
        System.out.println("***    1. Add ( + )                                ***");
        System.out.println("***    1. Substract ( - )                          ***");
        System.out.println("***    1. Multiply ( * )                           ***");
        System.out.println("***    1. Devide ( / )                             ***");
        System.out.println("-------------------------------------------------------");
    }

    public void chooseMathOperation() {
        System.out.println("Please choose from the below available 4 options:");
        viewMathOpearations();
     int chosenOption = getConsoleInput();
        switch (chosenOption) {
            case 1:
                System.out.println("Choice confirmation: " + MathOperations.ADD.optionNumber + " implies -> " + MathOperations.ADD.sign);
                break;
            case 2:
                System.out.println("Choice confirmation: " + MathOperations.SUBSTRACT.optionNumber + " implies -> " + MathOperations.SUBSTRACT.sign);
                break;
            case 3:
                System.out.println("Choice confirmation: " + MathOperations.MULTIPLY.optionNumber + " implies -> " + MathOperations.MULTIPLY.sign);
                break;
            case 4:
                System.out.println("Choice confirmation: " + MathOperations.DEVIDE.optionNumber + " implies -> " + MathOperations.DEVIDE.sign);
                break;
            default:
                System.out.println("Chosen option incorrect -> please try again (choose integer ranging from 1 -4)");
        }
    }

    public int getConsoleInput(){
        Scanner scan = new Scanner(System.in);
        int chosenOption = scan.nextInt();
        return chosenOption;
    }
}