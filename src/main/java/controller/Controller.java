package controller;

import model.Adder;
import model.Divider;
import model.Multiper;
import view.ViewResult;

import java.util.Scanner;

public class Controller {
    public static Controller runCalculator(){
        int num1;
        int num2;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое целое число");

        try {
            num1 = in.nextInt();
        } catch (Exception InputMismatchException) {
            System.out.println("Вы ввели не корректное целое число");
            return Controller.runCalculator();
        }

        System.out.println("Введите второе целое число");

        try {
            num2 = in.nextInt();
        } catch (Exception InputMismatchException) {
            System.out.println("Вы ввели не корректное целое число");
            return Controller.runCalculator();
        }

        System.out.println("Введите оператор выражения - \"*\", \"+\", \"/\",");
        String znack = in.next();
        switch (znack) {
            case ("+"):
                ViewResult.viewResult(Adder.adder(num1, num2).toString(), num1, num2, znack);
                break;
            case ("/"):
                ViewResult.viewResult(Divider.divider(num1, num2).toString(), num1, num2, znack);
                break;
            case ("*"):
                ViewResult.viewResult(Multiper.multiper(num1, num2).toString(), num1, num2, znack);
                break;
            default:
                System.out.println("Вы ввели не коррекный оператор выражения,введите оператор соотвтествующий указанному списку");
        }

        return Controller.runCalculator();
    }

}
