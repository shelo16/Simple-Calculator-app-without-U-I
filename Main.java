package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Methods methods = new Methods();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        boolean bool = true;
        int choice = 0 ;
        printInstructions();
        while (bool) {
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 :
                    printInstructions();
                    break;
                case 1:
                    sum();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3 :
                    multiply();
                    break;
                case 4 :
                    division();
                    break;
                case 5:
                    meanValue();
                    break;
                case 6:
                    System.out.println("Thanks for using Calculator");
                    bool = false;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\n Press :");
        System.out.println("\t 0 -- To print instructions");
        System.out.println("\t 1 -- To sum numbers");
        System.out.println("\t 2 -- To subtract numbers");
        System.out.println("\t 3 -- To multiply numbers");
        System.out.println("\t 4 -- To divide numbers");
        System.out.println("\t 5 -- To show mean value");
        System.out.println("\t 6 -- To quit");
    }

    public static ArrayList<Integer> run(){
        System.out.println("How many numbers do you have?");
        int num = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the numbers:");
        for (int i = 0 ; i<num ; i++){
            int numbers = scanner.nextInt();
            list.add(numbers);
        }
        return list;
    }

    public static void sum(){
        methods.sum(run());
    }

    public static void subtraction(){
        System.out.println("ORDERING IS CRUCIAL!!!!");
        methods.subtract(run());
    }

    public static void multiply(){
        methods.multiply(run());
    }

    public static void division(){
        System.out.println("ORDERING IS CRUCIAL");
        methods.division(run());
    }

    public static void meanValue(){
        methods.meanValue(run());
    }
}
