import java.util.Arrays;
import java.util.Scanner;

//TODO: Напишите метод для переворота строки задом наперед с помощью массива символов

public class TaskFirst {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in); При желании расскоментируем и пользуемся :)
        String text = "Я учусь программировать на Java"; //scanner.nextLine();
        char[] massiveText = text.toCharArray();
        char temp = 'a';
        int length = massiveText.length - 1;

        for (int i = 0; i < massiveText.length / 2; i++) {
            temp = massiveText[i];
            massiveText[i] = massiveText[length - i];
            massiveText[length - i] = temp;
        }

        //Вариант 2
        StringBuilder string = new StringBuilder(text);
        System.out.println("Начальный вариант: " + text);
        System.out.println("Решение, способ 1: ");
        System.out.println(string.reverse());

        System.out.println("Способ 2: ");
        System.out.println("Начальный вариант: " + text);
        System.out.println(String.valueOf(massiveText));
    }
}
