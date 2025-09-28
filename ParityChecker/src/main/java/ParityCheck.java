import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        //Проверка четности
        if (number % 2 == 1) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
        //Финальный вывод
        System.out.println("Спасибо!");
    }
}