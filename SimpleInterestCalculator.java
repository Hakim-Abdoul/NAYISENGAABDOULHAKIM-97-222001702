
    public class SimpleInterestCalculator {
    private double principal; // The initial principal amount
    private double rate;      // The annual interest rate (in percentage)
    private int time;         // Time period in years

    public SimpleInterestCalculator(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateSimpleInterest() {
        // Calculate simple interest using the formula: (Principal * Rate * Time) / 100
        double interest = (principal * rate * time) / 100;
        return interest;
    }

    public static void main(String[] args) {
        double principal = 100000.0; // Principal amount in Rwandan Francs (RWF)
        double rate = 5.0;           // Annual interest rate in percentage
        int time = 5;               // Time period in years

        SimpleInterestCalculator calculator = new SimpleInterestCalculator(principal, rate, time);

        double interest = calculator.calculateSimpleInterest();

        // Output the results
        System.out.println("The Principal Amount: " + principal + " RWF");
        System.out.println("Annual Interest Rate: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("The Simple Interest: " + interest + " RWF");
    }
}
    

