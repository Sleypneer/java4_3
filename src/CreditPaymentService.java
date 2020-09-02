public class CreditPaymentService {
    public double calculate(long summ, double rate, long period) {

         // i - процентная ставка в месяц
        double i = (rate / 12)/100;

         // kofa -  коэффициент ануитета
        double kofa = (i * (Math.pow(1 + i, period * 12))) / (Math.pow(1 + i, period * 12) - 1);
        // вычисляем платеж
        double pay = summ * kofa;

        return (long) pay;
    }
}
