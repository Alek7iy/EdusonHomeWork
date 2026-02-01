package HomeWork11;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Введите 3 строки: ");

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        int totalLength = str1.length() + str2.length() + str3.length();

        double avarage = (double) totalLength/3;

        System.out.println("Строки,длина которых меньше среднего: ");
        if (str1.length() < avarage){
            System.out.println(str1 + ". Длина: " + str1.length());
        }
        if (str2.length() < avarage){
            System.out.println(str2 + ". Длина: " + str2.length());
        }
        if (str3.length() < avarage){
            System.out.println(str3 + ". Длина: " + str3.length());
        }
        scanner.close();
    }
}
