import java.util.Scanner;

public class Calc {
    static Scanner scanner = new Scanner(System.in);

    public void start () {
        System.out.println("let`s do some Math, Jessey!");
    }
    public class SimpleMath {
        public String addition () {
            System.out.println("������� ����� ������� ����� �������");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double result = a + b;

            return "��� ���������: " + result;
        }
        public String subtraction () {
            System.out.println("������� ����������� �����");
            double a = scanner.nextDouble();
            System.out.println("������� ���������� �����");
            double b = scanner.nextDouble();
            double result = a - b;
            return "��� ���������: " + result;
        }
        public String division () {
            System.out.println("������� ������� �����");
            double a = scanner.nextDouble();
            System.out.println("������� ��������");
            double b = scanner.nextDouble();
            double result = a/b;
            return "��� ���������: " + result;
        }
        public String multiple () {
            System.out.println("������� ��� ����� ��� ���������");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double result = a * b;
            return "��� ���������: " + result;
        }

    }
}
