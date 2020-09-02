public class Main {
    public static void main(String[] agrs) {
        long summ = 1000000;
        double rate = 9.99;
        long period = 2;
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(summ, rate, period);

        System.out.println((long)payment);

    }
}
