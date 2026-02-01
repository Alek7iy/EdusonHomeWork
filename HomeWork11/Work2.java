package HomeWork11;

import java.util.Arrays;
import java.util.Scanner;

public class Work2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Введите три строик: ");

        String[] strings = new String[3];
        for(int i=0; i<3; i++){
            strings[i] =scanner.nextLine();
        }
        Arrays.sort(strings, (a,b)-> a.length() - b.length());

        System.out.println("Строки по возрастанию длины: ");
        for(String s : strings){
            System.out.println("Строка: " + s + ". Длина строки: " +  s.length() );
        }
    }
}
