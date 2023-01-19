package practice;

import java.util.Locale;
import java.util.Scanner;

public class MultipleAreas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double varA = sc.nextDouble();
        double varB = sc.nextDouble();
        double varC = sc.nextDouble();
        double tri, cir, sqr, trap, rec, pi = 3.14159;
        tri = (varA * varC)/2;
        cir = (pi * Math.pow(varC, 2));
        sqr = Math.pow(varB, 2);
        trap = 0.5 * (varA + varB) * varC;
        rec = varA * varB;
        System.out.printf("Triangulo = %.3f \nCirculo = %.3f \nQuadrado =%.3f \nTrapézio = %.3f \n Retângulo %.3f \n" ,
                tri, cir, sqr, trap, rec );
    }
}