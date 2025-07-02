package com.autobots.bankApplication;

public class BankDemo {
    public static void main(String[] args) throws Exception {


        MBank mahaMBank = new MBank(123456789123L,987654321);
        System.out.println(mahaMBank.getBalance());
        mahaMBank.deposit(100000);
        System.out.println(mahaMBank.getBalance());

        OptimaBank aliaOptima = new OptimaBank(123456789023L, 111111111);
        System.out.println(aliaOptima.getBalance());
        System.out.println("___________");
        Bank.transferFunds(mahaMBank,aliaOptima,500);

        DemirBank zinaidaDemirBank = new DemirBank(123456789028L,789456111);

       // Bank.transferFunds(zinaidaDemirBank,aliaOptima,1000);
        zinaidaDemirBank.deposit(500000);

        System.out.println(zinaidaDemirBank.getBalance());

        System.out.println(mahaMBank.getBalance());
        System.out.println(aliaOptima.getBalance());

        BankBase.allBankRecords.stream().filter(n -> n.getBalance() > 100).forEach(System.out::println);

        double allSumOfBanks = BankBase.allBankRecords.stream().mapToDouble(Bank::getBalance).sum();
        System.out.println(allSumOfBanks);
    }
}
