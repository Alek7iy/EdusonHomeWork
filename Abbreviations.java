import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abbreviations{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("[А-ЯЁ]{2,6}");
        Matcher matcher = pattern.matcher(input);

        boolean found = false;

        System.out.println("Найденные аббвереатуры: ");
        while (matcher.find()){
            String abr = matcher.group();
            System.out.println(abr);
            found = true;
        }
        if(!found){
            System.out.println("Аббвереатуры не найдены");
        }
        scanner.close();
    }
}
