/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 jeremiah pike
 */



import java.util.Calendar;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int length = input1.nextInt();

        System.out.println("Enter the width: ");
        int width = input1.nextInt();

        int area = length * width;
        System.out.println("You need " + ((area / 350)+ 1 )+ " gallons");





    }
}