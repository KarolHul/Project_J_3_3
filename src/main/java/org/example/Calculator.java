package org.example;

import java.util.Scanner;

public class Calculator {
    private Scanner scan = new Scanner(System.in);
    public void run(){
        System.out.println("Wybierz operacje:\n" +
                "1. Dodawanie\n" +
                "2. Odejmowanie\n" +
                "3. Mnożenie\n" +
                "4. Dzielenie\n");
        Integer operation = isOperation();
        System.out.println("podaj pierwsza liczbe");
        Integer num1 = isNumber();
        System.out.println("podaj druga liczbe");
        Integer num2 = isNumber();
        switch (operation) {
            case 1:
                System.out.println("Dodawanie: " +(num1+num2));
            case 2:
                System.out.println("Odejmownie: " +(num1-num2));
            case 3:
                System.out.println("Mnożenie: " +(num1*num2));
            case 4:
                System.out.println("Dzielenie: "+divide(num1,num2));
        }
    }
    private Integer isNumber(){
        Integer number;
        try{
            String x = scan.nextLine();
            number = Integer.parseInt(x);
        }catch (NumberFormatException nfe){
            System.out.println("Nie udalo sie sparsowac liczby, sprobuj jeszcze raz");
            number = isNumber();
        }
        return number;
    }
    private Integer isOperation(){
        Integer operation;
        try{
            String x = scan.nextLine();
            operation = Integer.parseInt(x);
        }catch (NumberFormatException nfe){
            System.out.println("Nie udalo sie sparsowac liczby, sprobuj jeszcze raz");
            operation = isNumber();
        }
        if (!(operation== 1 ||operation== 2 ||operation== 3 ||operation== 4)) {
            System.out.println("Sprobuj jeszcze raz");
            operation = isOperation();
        }
        return operation;
    }
    private Integer divide(int a,int b){
        Integer division = null;
        try{
            division = a/b;
        } catch (ArithmeticException ae){
            System.out.println("Can't divide by 0");
            a = scan.nextInt();
        }
        return division;
    }

}
