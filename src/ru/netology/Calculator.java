package ru.netology;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;

    BinaryOperator<Integer> minus = (x, y) -> x - y;

    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    // Ошибка заключалась в том, что выбрасываемое в результате деления на ноль исключение не обрабатывалось.
    // В качестве одного из решений можно написать условие проверки делителя, если он != 0, выполнять деление, если
    // равен нулю - возвращать null, а затем обработать NullPointerException в Main
    BinaryOperator<Integer> divide1 = (x, y) -> y != 0 ? x / y : null;

    // В качестве второго решения можно создать класс DivideByZeroException, унаследованный от ArithmeticException
    // с понятным пользователю сообщением. Выполнить проверку равенства делителя и нуля, при true - выбросить исключение,
    // а затем обработать его в Main. При false выполнить деление
    BinaryOperator<Integer> divide2 = (x, y) -> {
        if (y == 0) {
            throw new DivideByZeroException("Делить на ноль нельзя!");
        }

        return x / y;
    };

    UnaryOperator<Integer> pow = x -> x * x;

    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
