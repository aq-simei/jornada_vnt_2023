package practice;

import java.util.Locale;
import java.util.Scanner;

public class Earnings {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            int id = sc.nextInt();
            int hours = sc.nextInt();
            double hourRate = sc.nextDouble();

            double salary = hourRate * hours;
            System.out.printf("Id: %d. \n Salário = R$%.2f", id, salary);

        }

    }


