package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withDraw(double amount) {
        balance = (balance - amount) - 5;
    }

    @Override
    public String toString() {
        return "Account " + number + ", Holder: " + holder + String.format(", Balance: $ %.2f", balance);
    }
}
