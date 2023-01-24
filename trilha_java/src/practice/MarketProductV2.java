package practice;

import java.util.Locale;

public class MarketProductV2 {
    public String name;
    private double unitPrice;
    private double amount;

    private double inventoryValue;

    public MarketProductV2(String name, double unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;
    }
    public MarketProductV2(String name, double unitPrice, double amount){
        this.name = name;
        this.unitPrice = unitPrice;
        this.amount = amount;
        this.inventoryValue = this.unitPrice * this.amount;
    }
    private String getName(){
        return this.name;
    }
    private void setPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    private double getUnitPrice(){
        return this.unitPrice;
    }
    private void setAmount(double amount){
        this.amount = amount;
    }
    private double getAmount(){
        return this.amount;
    }

    public double getInventoryValue(){
        return this.inventoryValue;
    }

    public void status(){
        System.out.println("Nome do produto: " + this.getName());
        System.out.println("Preço unitario: " + this.getUnitPrice());
        System.out.println("Quantidade em estoque: " + this.getAmount());
        System.out.println("Valor em estoque: R$" + this.getInventoryValue());
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        MarketProductV2 product = new MarketProductV2("Banana",1.50, 200);
        product.status();
        MarketProductV2 product2 = new MarketProductV2("Chocolate",3.50, 100.0);
        product2.status();

    }
}
