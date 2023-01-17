
public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Calc.SimpleMath math = calc.new SimpleMath();
        calc.start();
        System.out.println(math.addition());
        System.out.println(math.division());
        System.out.println(math.multiple());
        System.out.println(math.subtraction());
    }
}