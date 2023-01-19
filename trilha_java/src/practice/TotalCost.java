package practice;

import java.util.Locale;
import java.util.Scanner;

public class TotalCost {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String id1, id2;
        int amount1, amount2;
        double singlePrice1 ,singlePrice2, total;
        System.out.println("Código do produto: ");
        sc.next();
        System.out.println("Quantidade: ");
        amount1 = sc.nextInt();
        System.out.println("Preço unitário: ");
        singlePrice1 = sc.nextDouble();
        System.out.println("Código do segundo produto: ");
        sc.next();
        System.out.println("Quantidade: ");
        amount2 = sc.nextInt();
        System.out.println("Preço unitário: ");
        singlePrice2 = sc.nextDouble();
        total = (amount1 * singlePrice1) + (amount2 * singlePrice2);

        System.out.printf("Total: R$%.2f", total);
    }


}