package practice;

import java.util.Locale;
import java.util.Scanner;

public class ProductsDiff {
    public static void main(String[] args){
        double[] entries;
        entries = new double[4] ;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 4 ; i++){
            double entry = sc.nextDouble();
            entries[i] = entry;
        };
        double result = (entries[0] * entries[1]) - (entries[2] * entries[3]);

        System.out.printf("O resultado é: %.2f ", result);
    }


}