package entities;

public class SavingsAccount extends Account02 { // A palavra reservada final faz com que não posssam herdar (extends) essa classe
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount) { // A palavra reservada final faz com que o metodo não seja sobrescrito
        balance -= amount;
    }
}
