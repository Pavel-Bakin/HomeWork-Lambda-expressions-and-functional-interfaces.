public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.multiply.apply(1, 1);

        try {
            //код, где может произойти деление на ноль
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            //обработка ошибки деления на ноль
            System.out.println("Ошибка деления на ноль");
        }
    }
}