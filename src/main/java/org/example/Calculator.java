package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        double number1 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter operator(+,-,/,*):");
        String operator = scan.nextLine();

        System.out.print("Enter second number:");
       // double number2 = scan.nextDouble();
        Double number2=2D;
        scan.nextLine();

        if (operator.equals("/") && number2==0){
            System.err.println("Cannot be divided by zero!");
            System.exit(0);
        }

//        switch (operator) {
//            case "+" ->System.out.println("Result:" + total(number1,number2));
//            case "-" ->System.out.println("Result:" + difference(number1,number2));
//            case "/" ->System.out.println("Result:" + divide(number1,number2));
//            case "*" ->System.out.println("Result:" + multiply(number1,number2));
//            default -> System.err.println("unknown operator");
//        }
    }
    Double divide(Double number1, Double number2){


        if (number1 == null || number2 == null ){
            throw new RuntimeException("Parameter can't be null");
        }
        if(number2 == 0){
            throw new RuntimeException("You can divide by zero");
        }
        return number1 / number2;

    }
    Double multiply(Double number1, Double number2){
        return number1 * number2;
    }
    Double total(Double number1, Double number2){
        return number1 + number2;
    }
    Double difference(Double number1, Double number2){
        return number1 - number2;
    }



}
