package practice;

import java.util.Arrays;

public class Application {
    String name;
    String position;
    double idealWage;
    String test;
    // getters and setters
    String getName(){
        return this.name;
    }
    String getPosition(){
        return this.position;
    }

    double getIdealWage(){
        return this.idealWage;
    }

    String getTest(){
        if(this.position == null){
            return "No position set yet.";
        } else {
            return (this.getPosition().equals("Tec") ?
                    "teste de tecnologia" :
                    "teste geral");
            }
    }
    void setName(String name){
        this.name = name;
    }
    void setPosition(String pos){
        this.position = pos;
    }
    void setIdealWage(double wage){
        this.idealWage = wage;
    }

    void status(){
        System.out.printf("Nome: %s . \n", this.getName());
        System.out.printf("Posição: %s . \n", this.getPosition());
        System.out.printf("Salário esperado: %.2f . \n", this.getIdealWage());
        System.out.printf("Teste: %s . \n",this.getTest());
    }

    public static void main(String[] args){
        Application application = new Application();
        application.setName("Teste");
        application.setPosition("Tec");
        application.setIdealWage(1800.00);
        application.status();

        Application application2 = new Application();
        application2.setName("Teste2");
        application2.setPosition("Geral");
        application2.setIdealWage(1500.00);
        application2.status();

    }
}