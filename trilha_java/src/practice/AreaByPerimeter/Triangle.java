package practice.AreaByPerimeter;

public class Triangle {
    double side1;
    double side2;
    double side3;

    void setSide1(double side1) {
        this.side1 = side1;
    }
    void setSide2(double side2) {
        this.side2 = side2;
    }

    void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    double area(){
        double sp = (this.side1 + this.side2 + this.side3)/2;
        return Math.sqrt(sp*(sp - this.side1)*(sp - this.side2)*(sp - this.side3));
    }
}
