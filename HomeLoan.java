package edu.bank;

public class HomeLoan implements Loan {
    private double interestRate = 6.5;

    @Override
    public void calculateInterest(double amount) {
        System.out.println("Home Loan interest for ₹" + amount + " is ₹" + (amount * interestRate / 100));
    }
}
