package practice;

public class Exchange{
    private double usdRate;
    private double amount;

    private double finalPrice;
    double getUsdRate(){
        return this.usdRate;
    };
    double getAmount(){
        return this.amount;
    }
    double getFinalPrice() {
        return this.finalPrice;
    }
    void setFinalPrice(){
        this.finalPrice = this.usdRate * (this.amount + this.getTaxRate());
    }
    void setAmount(double amount){
        this.amount = amount;
    }
    void setUsdRate(double rate){
        this.usdRate = rate;
    }
    double getTaxRate(){
        return amount * 0.06;
    }
    public static void main(String[] args){
        Exchange exc = new Exchange();
        exc.setAmount(200);
        exc.setUsdRate(5.5);
        exc.setFinalPrice();
        System.out.printf("The amount of usd is: %.2f \n", exc.getAmount());
        System.out.printf("The rate of conversion is %.2f \n", exc.getUsdRate());
        System.out.printf("The tax rate of this transaction is: %.2f \n", (exc.getTaxRate() * exc.getUsdRate()));
        System.out.printf("The final price is %.2f", exc.getFinalPrice());
    }
}
