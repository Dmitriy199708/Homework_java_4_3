import java.lang.Math;

public class CreditPaymentService {
    public int calculate(int amountOfCredit, int numberOfPayments, double interestRate) {
        double v = interestRate / 12 / 100; // Месячная процентная ставка
        double v1 = 1 + v; // 1 + Месячная процентная ставка

        double v2 = Math.pow(v1, numberOfPayments); // 1 + Месячная процентная ставка возведение в степень кол-ва платежей
        double v3 = (v * v2) / (v2 - 1);
        int monthlyPayment = (int) (amountOfCredit * v3);

        return monthlyPayment;
    }

}
