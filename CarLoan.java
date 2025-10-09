package edu.bank;

public class CarLoan implements Loan {
    private double interestRate = 8.0;

    @Override
    public void calculateInterest(double amount) {
        System.out.println("Car Loan interest for ₹" + amount + " is ₹" + (amount * interestRate / 100));
    }
}
