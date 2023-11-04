public class CompoundInterestCalculator {
    private double principal; // The initial principal amount
    private double rate;      // The annual interest rate (in percentage)
    private int time;         // Time period in years
    private int n;            // Number of times interest is compounded per year

    public CompoundInterestCalculator(double principal, double rate, int time, int n) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.n = n;
    }

    // Method to calculate the total amount to be paid including interest
    public double calculateTotalAmount() {
        // Formula to calculate compound interest
        double compoundInterest = principal * Math.pow(1 + (rate / (n * 100)), n * time) - principal;
        return principal + compoundInterest; // Calculate the total amount to be paid
    }

    public static void main(String[] args) {
        double principal = 500000.0; // Principal amount in Rwandan Francs (RWF)
        double rate = 18.0;         // Annual interest rate in percentage
        int time = 3;               // Time period in years
        int n = 12;                // Number of times interest is compounded per year (monthly)

        CompoundInterestCalculator calculator = new CompoundInterestCalculator(principal, rate, time, n);

        double totalAmount = calculator.calculateTotalAmount();

        // Output the results
        System.out.println("Principal Amount: " + principal + " RWF");
        System.out.println("Annual Interest Rate: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Number of Times Compounded per Year: " + n);
        System.out.println("Total Amount Paid After " + time + " years with Compound Interest: " + totalAmount + " RWF");
    }
}