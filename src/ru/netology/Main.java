package ru.netology;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        // Заключение в try - catch кода метода, потенциально приводящего к делению на 0, с отлавливанием ошибки и выводом
        // удобочитаемого текста.
        try {
            int a = calc.plus.apply(1, 2);
            calc.println.accept(a);

            int b = calc.minus.apply(1, 1);
            calc.println.accept(b);

            int c = calc.divide1.apply(a, b);
            calc.println.accept(c);
        }
        //Обработка NullPointerException для деления на 0
        catch (NullPointerException n) {
            System.out.println("Делить на ноль нельзя");
        }
        //Обработка ArithmeticException для деления на 0
//        catch (ArithmeticException m) {
//            System.out.println(m.getMessage());
//        }
    }
}
