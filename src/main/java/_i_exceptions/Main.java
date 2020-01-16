package _i_exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HourToSeconds hourToSeconds = new HourToSeconds();
        int calculation1 = hourToSeconds.getNumberOfSeconds(3);
        System.out.println("1st calculation result: " + calculation1);

        // example with scanner
        int[] table = {1, 2, 3, 4, 5};
        Scanner scan = new Scanner(System.in);
        int index = -1;
        System.out.println("Please advise of a chosen index, of which number you want to see: ");
        index = scan.nextInt();
if (index >=0 && index<table.length){
    System.out.println("Due to  index: "+table[index]