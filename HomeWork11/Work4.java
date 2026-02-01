package HomeWork11;

import java.util.Scanner;

public class Work4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 строчки: ");

        String[] worlds = (scanner.nextLine() + " " + scanner.nextLine() + " " + scanner.nextLine())
                .split("[\\s\\p{Punct}]+");

        String found = null;

        for(String world : worlds){
            if(world.isEmpty()) continue;

            boolean hasRepeat = false;
            for(int i=0;i < world.length(); i++){
                char c = world.charAt(i);
                if(world.indexOf(c,i + 1) != -1) {
                    hasRepeat = true;
                    break;
                }
            }
            if (!hasRepeat){
                found = world;
                break;
            }
        }
        System.out.println(found !=null ?
                "Первое слово без повторов: \"" + found + "\"" :
                "Слов без повторов не найдено.");
        scanner.close();
    }
}
