package practice;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class TriangleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double base = 0.0, height = 0.0, area;
        while(base <= 0.0 || height <= 0){
            System.out.println("Insira os valores da base e altura. ");
            base = sc.nextDouble();
            height = sc.nextDouble();
        }
        area = (base * height)/2;
        System.out.printf("Um triângulo com base %.2f e altura %.2f tem área %.2f .", base, height, area);

    }

}