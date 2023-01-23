package practice;

import java.util.Locale;

public class MarketProductV2 {
    private String name;
    private double price;
    private double amount;

    public MarketProductV2(String name, double price){
        this.name = name;
        this.price = price;
    }
    public MarketProductV2(String name, double price, double amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    private String getName(){
        return this.name;
    }
    private void setPrice(double price){
        this.price = price;
    }
    private double getPrice(){
        return this.price;
    }
    private void setAmount(double amount){
        this.amount = amount;
    }
    private double getAmount(){
        return this.amount;
    }


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        MarketProductV2 product = new MarketProductV2("Banana",1.50);

        System.out.println("Product name: " + product.getName());
        System.out.println("Product price: " + product.getPrice());
        System.out.println("Product amount: " + product.getAmount());
        System.out.println("Can also be created with amount: ");
        MarketProductV2 product2 = new MarketProductV2("Apple",3.50, 20.0);
        System.out.println("Product name: " + product2.getName());
        System.out.println("Product price: " + product2.getPrice());
        System.out.println("Product amount: " + product2.getAmount());
    }
}
