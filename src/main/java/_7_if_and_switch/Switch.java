package _7_if_and_switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("-------MENU-------");
        System.out.println("    1: Options ---");
        System.out.println("    2: Clients ----");
        System.out.println("    3: Addresses --");
        System.out.println("    4: Quit--------");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        do {
            switch (choice) {
                case 1:
                    System.out.println("Options menu: ");
                    break;  /* breas causes to stop the case block
                otherwise all below 3 options would be executed as well
                */
                case 2:
                    System.out.println("Clients menu: ");
                    break;
                case 3:
                    System.out.println("Addresses menu: ");
                    break;
                default:  // default not necessary; after default instructions in case the above were not met
                    System.out.println("Please choose 1 of 4 available variants");
            }
        } while (choice != 4);
    }
}
