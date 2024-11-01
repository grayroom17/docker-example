package javaapp;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в календарь");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Пожалуйста, введите год: ");
        int year = keyboard.nextInt();
        System.out.print("Введите номер любого месяца: ");
        int month = keyboard.nextInt();
        System.out.println("Всего хорошего!");
    }

}
