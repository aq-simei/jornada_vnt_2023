package practice;

import java.util.Locale;

public class Rectangle {
    double base;
    double height;

    double diagonal;

    void setBase(double value){
        this.base = value;
    }
    double getBase(){
        return this.base;
    }
    void setHeight(double value){
        this.height = value;
    }

    double getHeight(){
        return this.height;
    }

    double getDiagonal(){
        return Math.sqrt(Math.pow(this.getBase(), 2) + Math.pow(this.getHeight(), 2));
    }

    double getArea(){
        return (this.getBase() * this.getHeight())/2;
    };
    double getPerimeter(){
        return(this.getDiagonal() + this.getBase() + this.getHeight());
    };

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Rectangle rct = new Rectangle();
        rct.setBase(3);
        rct.setHeight(4);


        System.out.printf("%.2f , %.2f -> Diagonal : %.2f, Area: %.2f ,Perimetro: %.2f", rct.getBase(),
                rct.getHeight(), rct.getDiagonal(), rct.getArea(), rct.getPerimeter());
    }
}