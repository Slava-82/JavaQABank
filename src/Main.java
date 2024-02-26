public class Main {
    public static void main(String[] args) {
        CreditPaymentService bankCalculate = new CreditPaymentService();
        double O = 1000_000; // сумма кредита
        double Pr = 9.99; // процентная ставка
        double S = Pr / (100 * 12);
        int P = 12; // срок (месяцев)
        int a = 24; // срок (месяцев)
        int b = 36; // срок (месяцев)

        int EP12 = bankCalculate.calculate(O, S, P);
        int EP24 = bankCalculate.calculate(O, S, a);
        int EP36 = bankCalculate.calculate(O, S, b);

        System.out.println("Сумма кредита = " + O + " руб.");
        System.out.println("Процентная ставка = " + Pr + " %");
        System.out.println("Ежемесячный платеж при оформлении кредита сроком на " + P + " месяцев равен "
                + EP12 + " руб.");
        System.out.println("Ежемесячный платеж при оформлении кредита сроком на " + a + " месяца равен "
                + EP24 + " руб.");
        System.out.println("Ежемесячный платеж при оформлении кредита сроком на " + b + " месяцев равен "
                + EP36 + " руб.");

    }
}