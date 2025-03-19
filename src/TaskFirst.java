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

        System.out.println(Arrays.toString(massiveText));
        System.out.println(String.valueOf(massiveText));
    }
}
