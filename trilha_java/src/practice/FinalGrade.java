package practice;

import java.util.Locale;
import java.util.Scanner;

public class FinalGrade {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        double grade1, grade2, grade3, grade4, finalGrade;
        int age;
        System.out.println("Seu nome: ");
        name = sc.next();
        System.out.println("Sua idade: ");
        age = sc.nextInt();
        System.out.println("Primeira nota: ");
        grade1 = sc.nextFloat();
        System.out.println("Segunda nota: ");
        grade2 = sc.nextFloat();
        System.out.println("Terceira nota: ");
        grade3 = sc.nextFloat();
        System.out.println("Última nota: ");
        grade4 = sc.nextFloat();

        finalGrade = (grade1 + grade2 + grade3 + grade4)/4;
        System.out.printf("%s \n %d anos. %.2f , %.2f, %.2f, %.2f \n %.2f", name,age,grade1, grade2,
                grade3, grade4, finalGrade);
    }

}