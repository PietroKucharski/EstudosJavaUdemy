package entities;

import exceptions.BusinessException;

public class Account03 {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account03() {
    }

    public Account03(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) throws BusinessException {
        balance += amount;
    }

    public void withDraw(Double amount) throws BusinessException {
        if(amount > balance) {
            throw new BusinessException("Withdraw error: Not enough balance");
        }
        if(amount > withdrawLimit) {
            throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
        }
        balance -= amount;
    }
}
