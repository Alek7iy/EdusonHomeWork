package HomeWork11;


import java.util.Scanner;

public class Work1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три строки: ");

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String shortest = findShortest(str1,str2,str3);
        String longest = findLongest(str1,str2,str3);

        System.out.println("Самая короткая строка: " + shortest + ".Её длина: " + shortest.length() + ".");
        System.out.println("Самая длинная строка: " + longest + ".Её длина: " + longest.length() + ".");

        scanner.close();
    }
    private static String findShortest(String a,String b,String c){
        String shortest = a;
        if (b.length() < shortest.length()){
            shortest = b;
        }
        if (c.length() < shortest.length()){
            shortest = c;
        }
        return shortest;
    }
    private static String findLongest(String a, String b,String c){
        String longest = a;
        if (b.length() > longest.length()){
            longest = b;
        }
        if (c.length() > longest.length()){
            longest = c;
        }
        return longest;
    }
}