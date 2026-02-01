package HomeWork11;

import java.util.Scanner;

public class Work5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите cлово: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        for(char c : input.toCharArray()){
            result.append(c).append(c);
        }
        System.out.println("Результат: " + result);
        scanner.close();
    }
}
