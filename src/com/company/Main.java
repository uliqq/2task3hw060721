package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount = new BankAccount(20000);

        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                } catch (LimitException limitException) {
                    limitException.getMessage();
                }
                break;

            }
        }
    }
}
