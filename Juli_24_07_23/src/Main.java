import java.util.Random;
public class Main {

public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Random random = new Random();

        int num1 = random.nextInt(100); // Генерируем случайное число от 0 до 99
        int num2 = random.nextInt(100);

        System.out.println("Первое число: " + num1);
        System.out.println("Второе число: " + num2);

        // Вызываем методы калькулятора с сгенерированными числами в качестве аргументов
        int summa = calculator.add(num1, num2);
        int difference = calculator.subtract(num1, num2);
        int product = calculator.multiply(num1, num2);
        int delenie = calculator.divide(num1, num2);

        System.out.println("Сумма: " + summa);
        System.out.println("Вычитание: " + difference);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + delenie);
        }
        }