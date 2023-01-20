package practice.AreaByPerimeter;

import java.util.Locale;

public class AreaBySemiPerimeter {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Triangle t1 = new Triangle();
        t1.setSide1(3.0);
        t1.setSide2(4.0);
        t1.setSide3(5.0);
        System.out.printf("Area do triangulo de lados %.2f , %.2f e %.2f = %.2f \n",t1.getSide1(), t1.getSide2(),
                t1.getSide3(), t1.area());;

        Triangle t2 = new Triangle();
        t2.setSide1(9.0);
        t2.setSide2(12.0);
        t2.setSide3(15.0);
        System.out.printf("Area do triangulo de lados %.2f , %.2f e %.2f = %.2f",t2.getSide1(), t2.getSide2(),
                t2.getSide3(), t2.area());;
    }

}