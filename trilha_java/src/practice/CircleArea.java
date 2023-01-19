package practice;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius, pi = 3.14159, area;
        System.out.println("Valor do raio: ");
        radius = sc.nextDouble();
        area = pi * Math.pow(radius, 2.0);
        System.out.printf("A área de um circulo com %.2f is %.3f .", radius, area);
    }
}