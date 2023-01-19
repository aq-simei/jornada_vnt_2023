package practice;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double num1, num2, sum, diff, div, times;
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();

        sum = (num1 + num2);
        diff = num1 - num2;
        div = num1 / num2;
        times = num1 * num2;

        System.out.printf("Subtração: %.2f - %.2f = %.2f %n", num1, num2, diff);
        System.out.printf("Soma: %.2f + %.2f = %.2f %n", num1, num2, sum);
        System.out.printf("Divisão: %.2f / %.2f = %.2f %n", num1, num2, div);
        System.out.printf("Produto: %.2f * %.2f = %.2f %n", num1, num2, times);
    }
}