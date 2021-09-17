public class CreditPaymentService {
    public double calculate(double credit, double time, double interestRate) {
        double iR = interestRate / 100 / 12;

        double a1 = 1 + iR;
        double b1 = time;
        double c1 = Math.pow(a1, b1);
        double monthlypayment = ((iR * c1) / (c1 - 1)) * credit;
        return (int) monthlypayment;
    }
}
