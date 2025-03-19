import java.util.Scanner;

//TODO: Напишите метод для проверки правильности формата даты в строке (например, "гггг-мм-дд").

public class TaskFourth {
    public static void main(String[] args) {
        System.out.println("Введите дату: ");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        scanner.close();

        if (date.matches("\\d{4}-\\d{2}-\\d{2}")) {
            System.out.println("Формат даты введен верно.");
        } else {
            System.out.println("Формат даты введен неверно.");
        }

    }
}
