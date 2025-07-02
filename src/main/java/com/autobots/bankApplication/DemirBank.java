package com.autobots.bankApplication;

public class DemirBank extends BankBase{

    private double balance = 500;

    public DemirBank(long accountNumber, long routingNumber) throws Exception {
        super(accountNumber, routingNumber); // конструктор нужен для создания объекта
        addToAllBankRecords(this); // ссылается на этот объект
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0 || amount > 500000){
            throw new IllegalArgumentException("Invalid amount! can not be deposit");
        }
        balance += amount;
    }

    @Override
    public void withDraw(double amount) {
        if (amount < 0 || amount > 70000){
            throw new IllegalArgumentException("Invalid amount! can not be withDraw");
        }else {
            if (balance < amount){
                throw new IllegalArgumentException("Insufficient funds");
            }else{
                balance -= amount;
            }
        }
    }
}
