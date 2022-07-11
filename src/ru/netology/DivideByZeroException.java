package ru.netology;

public class DivideByZeroException extends ArithmeticException {
    DivideByZeroException(String message) {
        super(message);
    }
}
