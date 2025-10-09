import edu.bank.*;

public class Lab5 {
    public static void main(String[] args) {
        Loan hl = new HomeLoan();
        Loan cl = new CarLoan();

        hl.calculateInterest(500000);
        cl.calculateInterest(300000);
    }
}
