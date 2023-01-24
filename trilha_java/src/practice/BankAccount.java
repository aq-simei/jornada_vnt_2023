package practice;

import java.util.Locale;

public class BankAccount {
    // attributes
    public String accountNumber;
    private String accountHolder;
    private Boolean isAccountOpen;
    protected String accountType;
    private double monthlyFee;
    private double balance;

    // getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public Boolean getIsAccountOpen() {
        return isAccountOpen;
    }
    public void setIsAccountOpen(Boolean accountStatus) {
        this.isAccountOpen = accountStatus;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        if(this.getIsAccountOpen()){
            switch (accountType) {
                case "CP" :
                    this.setBalance(150.0);
                    this.monthlyFee = 20.0;
                    this.accountType = accountType;
                    break;
                case "CC":
                    this.setBalance(50.0);
                    this.monthlyFee = 12.0;
                    this.accountType = accountType;
                    break;
                default:
                    throw new RuntimeException("Invalid account type");
            }
            }  else {
                throw new RuntimeException("Error on setting account type: Account is closed");
            }
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Constructor(s)
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.isAccountOpen = false;
    }

    // Methods

    public void openAccount() {
        this.setIsAccountOpen(true);
    }

    public void closeAccount(){
        this.setIsAccountOpen(false);
    }

    public void deposit(double value) {
        this.balance = this.balance + value;
    }
    public void withdraw(double value) {
        if(this.balance > value){
            this.balance = this.balance - value;
        } else {
            throw new RuntimeException("Error on withdraw: Insufficient funds");
        }
    }

    public void payMonthlyFee(){
        if(this.getIsAccountOpen()){
            if(this.getBalance() > this.monthlyFee){
                this.withdraw(this.monthlyFee);
            } else {
                throw new RuntimeException("Error on paying monthly fee: Insufficient funds");
            }
        } else {
            throw new RuntimeException("Error on paying monthly fee: Account is closed");
        }
    }

    public void status(){
        System.out.println("Número da conta: " + this.getAccountNumber());
        System.out.println("Titular da conta: " + this.getAccountHolder());
        System.out.println("Tipo da conta: " + (this.getAccountType().equals("CC") ?
                "Conta Corrente" :
                "Conta Poupança"));
        System.out.println("Saldo da conta: R$" + this.getBalance());
        System.out.println("Status da conta: " + (this.getIsAccountOpen() ?
                "Conta aberta":
                "Conta fechada"));
        System.out.println("Taxa mensal: R$" + this.monthlyFee + "\n");
    }

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        BankAccount account1 = new BankAccount("0001", "João Silva");
        BankAccount account2 = new BankAccount("0002", "Maria Silva");
        account1.openAccount();
        account2.openAccount();
        account1.setAccountType("CC");
        account2.setAccountType("CP");
        account1.deposit(300.0);
        account2.deposit(400);

        account1.status();
        account2.status();
    }
    }

