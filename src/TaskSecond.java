import java.util.Arrays;
import java.util.Scanner;

//TODO: Напишите метод для проверки areAnagrams, принимающего 2 строки,
// являются ли они анаграммами (имеют одни и те же символы в разном порядке).

public class TaskSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringFirst = scanner.nextLine().toLowerCase().replaceAll(" ", "");
        String stringSecond = scanner.nextLine().toLowerCase().replaceAll(" ", "");
        areAnagrams(stringFirst, stringSecond);
        scanner.close();
    }

    public static void areAnagrams(String stringFirst, String stringSecond) {
        if (stringFirst.length() != stringSecond.length()) {
            System.out.println("Строки не анаграммы.");
            return;
        }

        char[] stringFirstChar = stringFirst.toCharArray();
        char[] stringSecondChar = stringSecond.toCharArray();
        Arrays.sort(stringFirstChar);
        Arrays.sort(stringSecondChar);
        if (Arrays.equals(stringFirstChar, stringSecondChar)) {
            System.out.println("Строки анаграммы.");
        } else {
            System.out.println("Строки не анаграммы.");
        }
    }
}

