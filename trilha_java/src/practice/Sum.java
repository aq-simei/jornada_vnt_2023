
package practice;

import java.util.Locale;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double firstInput, secondInput;
        firstInput = sc.nextDouble();
        secondInput = sc.nextDouble();
        double result = firstInput + secondInput;

        System.out.printf("A soma entre %.2f e %.2f é %.2f",firstInput, secondInput, result);
    }


}