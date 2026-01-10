package Eduson;
import java.util.Random;
import java.util.Scanner;

class ArrayWithSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int [][] matrix = new int[5][5];
        int sum = 0;
        System.out.println("Исходный массив:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nВведите число для прибавления к каждому элементу: ");
        int addNumber = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] += addNumber;
            }
        }

        System.out.println("\nМассив после прибавления " + addNumber + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        int totalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                totalSum += matrix[i][j];
            }
        }

        System.out.println("\nСумма всех элементов массива: " + totalSum);

        scanner.close();
    }
}



class Chess {
    public static void main (String[] args){
        String [][] board = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (( i + j ) %2 == 0){
                    board[i][j] = "W";}
                else {
                    board[i][j] = "B";
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}