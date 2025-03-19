import java.util.Scanner;

//TODO: Напишите метод для замены всех чисел в строке на символ "X".

public class TaskFifth {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println(string.replaceAll("\\d+", "X"));
    }
}
