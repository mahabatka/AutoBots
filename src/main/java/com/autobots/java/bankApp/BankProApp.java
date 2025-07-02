package com.autobots.java.bankApp;

import java.util.HashMap;
import java.util.Map;

public class BankProApp {

    private static final Map<String, Client> clients = new HashMap<>();

    public static void main(String[] args) {
        Client asan = new Client("Asan Uson","123");

        DepositAccount asanDeposit = new DepositAccount(asan,Currency.USD);
        CreditAccount asanCredit = new CreditAccount(asan,Currency.EUR);

        asan.addAccount(asanDeposit);
        asan.addAccount(asanCredit);

        clients.put(asan.getClientID(),asan);




        
    }
}
