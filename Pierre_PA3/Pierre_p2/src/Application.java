public class Application {
    public static void main(String[] args) { //Tester for the methods
        SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount (2000.0);
        saver2= new SavingsAccount (3000.0);

        int total = 0;
        SavingsAccount.modifyInterestRate (0.04);
        System.out.println("\nBalance for Saver 1 with 4% interest");
        for(int x=1; x<=12; x++) {
            saver1.calculateMonthlyInterest();
            System.out.println("\nMonth " + x+" : "+saver1.getSavingBalance());
        }
        System.out.println("\nBalance for Saver 2 with 4% interest");
        for(int x=1; x<=12; x++) {
            saver2.calculateMonthlyInterest();
            System.out.println("\nMonth " + x+" : "+saver2.getSavingBalance());
        }
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("\nBalance for Saver 1 with 5% interest ");
        for(int x=1; x<=12; x++) {
            saver1.calculateMonthlyInterest();
            System.out.println("\nMonth " + x+" : "+ saver1.getSavingBalance());
        }
        System.out.println("\nBalance for Saver 2 with 5% interest ");
        for(int x=1; x<=12; x++) {
            saver2.calculateMonthlyInterest();
            System.out.println("\nMonth " + x+" : "+ saver2.getSavingBalance());
        }

    }
}
