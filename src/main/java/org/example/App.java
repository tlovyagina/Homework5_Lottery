package org.example;

public class App {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        System.out.println("Результаты тура лотереи: " + lottery.roll());
    }
}