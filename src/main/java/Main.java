import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int firstNumber = new Scanner(System.in).nextInt();
        //int firstNumber = 5;
        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();
        //int secondNumber = 5;
        int sum = firstNumber + secondNumber;
        int raznost = firstNumber - secondNumber;
        int proizvedenie = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;
        System.out.println("Сумма: " + sum + "\n" + "Разность: " + raznost + "\n" + "Произведение: " + proizvedenie + "\n" + "Частное: " + quotient);
    }
}
