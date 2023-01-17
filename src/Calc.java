import java.util.Scanner;

public class Calc {
    static Scanner scanner = new Scanner(System.in);

    public void start () {
        System.out.println("let`s do some Math, Jessey!");
    }
    public class SimpleMath {
        public String addition () {
            System.out.println("¬ведите числа которые нужно сложить");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double result = a + b;

            return "¬аш результат: " + result;
        }
        public String subtraction () {
            System.out.println("¬ведите уменьшаемое число");
            double a = scanner.nextDouble();
            System.out.println("¬ведите вычитаемое число");
            double b = scanner.nextDouble();
            double result = a - b;
            return "¬аш результат: " + result;
        }
        public String division () {
            System.out.println("¬ведите делимое число");
            double a = scanner.nextDouble();
            System.out.println("¬ведите делитель");
            double b = scanner.nextDouble();
            double result = a/b;
            return "¬аш результат: " + result;
        }
        public String multiple () {
            System.out.println("¬ведите два числа дл€ умножени€");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double result = a * b;
            return "¬аш результат: " + result;
        }

    }
}
