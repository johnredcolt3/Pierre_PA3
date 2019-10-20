public class SavingsAccount {

    static private double annualInterestRate;
    private double savingBalance;

    public SavingsAccount() {

    }

    public SavingsAccount(double savingBalance) {
        this.savingBalance = savingBalance; //Stores passed balance
    }

    public double getSavingBalance() {
        return this.savingBalance; //returns saving balance
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate; //Changes the interest rate
    }

    public void calculateMonthlyInterest() {
        double InterestM;
        InterestM = (double) (this.savingBalance * annualInterestRate / 12); //Calculate interest per month
        this.savingBalance += InterestM;
    }
}

