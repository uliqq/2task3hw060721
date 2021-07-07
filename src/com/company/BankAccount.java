package com.company;

public class BankAccount {

    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public void setAmount(double amount) throws LimitException {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) throws LimitException {
        setAmount(getAmount() + sum);
        System.out.println("Депозит: " + sum + "\nОстаток: " + (amount + sum));
        return amount;
    }

    public int withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("___________________________" +
                    "\nЗапрашиваемая сумма для вывода не может быть больше остатка на балансе!" +
                    "\nБаланс: " + amount, amount);
        } else {
            setAmount(getAmount() - sum);
            System.out.println("___________________________" + "\nВывод: " + sum + "\nОстаток: " + amount);
            return (int) amount;
        }
    }
}
