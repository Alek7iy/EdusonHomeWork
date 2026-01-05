package Eduson;

import java.util.Scanner;

class NumberScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " чётное.");
        }
        else {
            System.out.println("Число " + number + " нечётное.");
        }

        scanner.close();
    }
}


class Temperature{
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите температуру: ");
        double t= scanner.nextDouble();
        if (t > -5) {
            System.out.println("Warm");
        }
        else if (t > -20) {
            System.out.println("Normal");
        }
        else {
            System.out.println("Cold");
        }
        scanner.close();
    }
}


class SquareOfTheNumber {
    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
            int square = i * i;
            System.out.println("Квадрат числа " + i + " = " + square);
        }
    }
}


class StepSeven {
    public static void main (String[] args) {
        int number = 7;
        while (number <= 98) {
            System.out.print(number + " ");
            number += 7;
        }
    }
}