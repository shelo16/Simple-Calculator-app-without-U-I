package com.company;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    public ArrayList<Integer> numbers;



    public int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        System.out.println(sum);
        return sum;
    }

    public int subtract(ArrayList<Integer> numbers){
        int total = numbers.get(0);
        for (int i = 0 ; i<numbers.size()-1 ; i++){
            total = total - numbers.get(i+1);
        }
        System.out.println(total);
        return total;
    }

    public int multiply(ArrayList<Integer> numbers){
        int total=1;
        for (int number : numbers){
            total = total * number;
        }
        System.out.println(total);
        return total;
    }

    public int division(ArrayList<Integer> numbers){
        int total = numbers.get(0);
        try {
            for (int i = 0; i < numbers.size() - 1; i++) {
                total = total / numbers.get(i + 1);
            }
            System.out.println(total);
        }catch (ArithmeticException ae){
            System.out.println("Devision by zero!!!!!");
        }
        return total;
    }

    public void meanValue(ArrayList<Integer> numbers){
        try {
            int sum = 0;
            for (int i = 0; i < numbers.size(); i++) {
                sum += numbers.get(i);
            }
            int answer = sum / numbers.size();
            System.out.println(answer);
        }catch (ArithmeticException ae){
            System.out.println("Devision by zero!!!!!");
        }
    }


}
