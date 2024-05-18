package Task2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        System.out.println("Введите слова через пробел");
        String[] userInput = scanner.nextLine().split(" ");
        int lastSymbol;
        int firstSymbol = 0;
        for (int i = 0; i < userInput.length; i++) {
            lastSymbol = userInput[i].length() - 1;
            map.put(String.valueOf(userInput[i].charAt(firstSymbol)), String.valueOf(userInput[i].charAt(lastSymbol)));
        }
        System.out.println(map);
    }
}