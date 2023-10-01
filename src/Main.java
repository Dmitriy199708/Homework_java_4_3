public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPayment;

        monthlyPayment = service.calculate (1_000_000,12,9.99);
        System.out.println("Ежемесячный платеж на 1 год = " + monthlyPayment);

        monthlyPayment = service.calculate (1_000_000,24,9.99);
        System.out.println("Ежемесячный платеж на 2 год = " + monthlyPayment);

        monthlyPayment = service.calculate (1_000_000,36,9.99);
        System.out.println("Ежемесячный платеж на 3 год = " + monthlyPayment);

    }

}