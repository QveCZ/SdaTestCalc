package org.example;

import java.util.Scanner;

public class test {


//    static Double divide(Double num1, Double num2) {
//        return num1 / num2;
//    }
//    static Double multiple(Double num1, Double num2){
//        return num1 * num2;
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        char operator;

//       if (num1 = null){
//           System.out.println("proměná je null");
//
//       }else{
//           System.out.println("proměná není null");
//
//       }
        System.out.println("الدار البيضاء");
        int tabLength = 4;
        String[] names = new String[tabLength];
        names[0] = "Jan";
        names[3] = "roman";

        for (int i = 0; i < tabLength; i++) {
            System.out.println("Element number " + (i + 1)  + ": " + names[i]);
            if (names[i] == null){
                System.out.println("proměná je null");

            }else{
                System.out.println("proměná není null");

            }
        }

    }
}

