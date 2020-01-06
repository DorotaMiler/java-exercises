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
                    break;
                case 2:
                    System.out.println("Clients menu: ");
                    break;
                case 3:
                    System.out.println("Addresses menu: ");
                    break;
            }
        } while (choice != 4);
    }
}
