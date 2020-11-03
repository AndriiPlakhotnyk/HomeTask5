package ua.com.alevel.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChoiceOfCounting {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Operations operations = new Operations();

    public void counter() throws IOException {

        double num1 = 0;
        double num2 = 0;

        System.out.println("Выбирете номер вычисления");
        System.out.println("Для завершения программы, введите x");
        System.out.println("1. Сумма");
        System.out.println("2. Разница");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Синус ");
        System.out.println("6. Косинус");
        System.out.println("7. Тангенс");
        System.out.println("8. Котангенс");
        System.out.println("9. Возведение в степень");
        System.out.println("10. Извлечение квадратного корня");
        String s = reader.readLine();
        if (s.equals("x")) {
            System.exit(0);
        }

        System.out.println("Введите число в формате 1.0");

        String a = reader.readLine();
        if (a.equals("x")) {
            System.exit(0);
        }
        if (s.equals("5") || s.equals("6") || s.equals("7") || s.equals("8") || s.equals("10")) {
            try {
                if (a.contains(".")) {
                    num1 = Double.parseDouble(a);
                }
            }catch (NumberFormatException e){
                System.out.println("Программа требует ввода числа в формате 1.0, попробуйте заново");
                System.out.println("");
                counter();
            }
            switch (s) {
                case "5":
                    operations.sinus(num1);
                    break;
                case "6":
                    operations.cosine(num1);
                    break;
                case "7":
                    operations.tangent(num1);
                    break;
                case "8":
                    operations.cotangent(num1);
                    break;
                case "10":
                    operations.squareRoot(num1);
            }
            counter();

        } else {
            String b = reader.readLine();
            if (b.equals("x")) {
                System.exit(0);
            }
            try {
                if ( b.contains(".")) {

                    num2 = Double.parseDouble(b);
                }
            } catch (NumberFormatException e) {
                System.out.println("Программа требует ввода числа в формате 1.0, попробуйте заново");
                System.out.println("");
                counter();
            }


            switch (s) {
                case "1":
                    operations.plus(num1, num2);
                    break;
                case "2":
                    operations.minus(num1, num2);
                    break;
                case "3":
                    operations.multiplication(num1, num2);
                    break;
                case "4":
                    operations.division(num1, num2);
                    break;
                case "9":
                    operations.degree(num1, num2);

            }
            counter();
        }

    }

}
