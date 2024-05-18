package Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова через пробел");
        String[] userInput = scanner.nextLine().split(" ");
        HashMap<String, Boolean> map = new HashMap<>();
        for (String str : userInput){
            if (map.containsKey(str)){
                map.put(str, true);
            } else {
                map.put(str, false);
            }
        }
        System.out.println(map);
    }
}
