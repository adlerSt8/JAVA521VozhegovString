import java.util.Scanner;

//TODO: Напишите метод isPalindrome с помощью регулярных выражений и методов String.
// Вызывать в главном методе, передавая строчку на проверку.

public class TaskThird {
    public static void main(String[] args) {
        System.out.println("Введите слово или строку: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toLowerCase().replaceAll("\\s", "");
        scanner.close();
        if (isPalindrome(string)) {
            System.out.println("Строка(слово) является палиндромом.");
        } else {
            System.out.println("Строка(слово) не является палиндромом");
        }
    }

    public static boolean isPalindrome(String string) {
        int start = 0;
        int end = string.length() - 1;

        while(start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
