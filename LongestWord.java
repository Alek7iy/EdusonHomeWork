package HomeWork14;

import org.w3c.dom.Text;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestWord {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "LongestWord.txt";

        try {
            String text = readTextFromFile(inputFile);
            String longestWord = extractLongestWord(text);
            writeTextToFile(outputFile, longestWord);

            System.out.println("Самое длинное слово: " + longestWord);
            System.out.println("Записано в файл " + outputFile);
        }catch (IOException e){
            System.out.println("Ошибка в работе с файлом " + e.getMessage());
        }
    }

    private static String readTextFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    private static String extractLongestWord(String text) {
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern.matcher(text);

        String longestWord = "";
        while (matcher.find()) {
            String word = matcher.group();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    private static void writeTextToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, StandardCharsets.UTF_8))) {
            writer.write(content);
        }
    }
}

