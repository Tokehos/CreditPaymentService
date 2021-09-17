public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double interestRate12 = 9.99;
        double credit12 = 1_000_000;
        double time12 = 12;
        double monthlypayment12 = service.calculate(credit12, time12, interestRate12);
        System.out.println(monthlypayment12);


        double interestRate24 = 9.99;
        double credit24 = 1_000_000;
        double time24 = 24;
        double monthlypayment24 = service.calculate(credit24, time24, interestRate24);
        System.out.println(monthlypayment24);

        double interestRate36 = 9.99;
        double credit36 = 1_000_000;
        double time36 = 36;
        double monthlypayment36 = service.calculate(credit36, time36, interestRate36);
        System.out.println(monthlypayment36);
    }
}