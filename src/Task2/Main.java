package Task2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        String[] userInput = scanner.nextLine().split(" ");
        System.out.println(userInput[1].length());
        //int lastSymbol = userInput[1].length() - 1;
        int lastSymbol;
        int firstSymbol = 0;
        //System.out.println(userInput[1].charAt(firstSymbol) + " " + userInput[1].charAt(lastSymbol));
        System.out.println();

        for (int i = 0; i < userInput.length; i++) {
            lastSymbol = userInput[i].length() - 1;
            String fs = String.valueOf(userInput[i].charAt(firstSymbol));
            String ls = String.valueOf(userInput[i].charAt(lastSymbol));
            map.put(fs, ls);
        }
        System.out.println(map);
    }
}
