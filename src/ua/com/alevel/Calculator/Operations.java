package ua.com.alevel.Calculator;

import java.io.IOException;

public class Operations {

    public void plus(double a, double b) {
        System.out.println("Сумма равна : " + (a + b));
    }

    public void minus(double a, double b) {
        System.out.println("Разница равна: " + (a - b));
    }

    public void multiplication(double a, double b) {
        System.out.println("Умножение равно: " + (a * b));
    }

    public void division(double a, double b) {

        if (b == 0.0) {
            System.out.println("Деление на ноль невозможно, попробуйте заново");
            System.out.println("");
        } else {
            System.out.println("Деление равно: " + (a / b));
        }
    }

    public void sinus(double a) { System.out.println("Синус равен: " + Math.sin(a / 57.296)); }

    public void cosine(double a) {
        System.out.println("Косинус равен: " + Math.cos(a / 57.296));
    }

    public void tangent(double a) {
        System.out.println("Тангенс равен: " + Math.tan(a / 57.296));
    }

    public void cotangent(double a) {
        System.out.println("Котангенс равен: " + (1 / Math.tan(a / 57.296)));
    }

    public void degree(double a, double b) { System.out.println("Возведенное число в степень равно: " + Math.pow(a, b)); }

    public void squareRoot(double a) { System.out.println("Корень введенного числа равен: "+Math.sqrt(a));}

}
