import java.util.Arrays;
import java.util.Scanner;

//TODO: Напишите метод для замены всех чисел в строке на символ "X".

public class TaskFifth {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        //Способ 1:
        System.out.println(string.replaceAll("\\d+", "X"));
        }
    //Способ 2:
    public static void replaceNumber(String string) {
        String[] massiveString = string.split(" ");
        for(int i = 0; i < massiveString.length; i++) {
            if(massiveString[i].matches("\\d+")) {
                massiveString[i] = "X";
            }
        }
        System.out.println(String.join(" ",massiveString));
    }
}
