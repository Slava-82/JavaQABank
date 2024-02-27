public class Main {
    public static void main(String[] args) {
        CreditPaymentService bankCalculate = new CreditPaymentService();
        double loanAmount = 1000_000; // сумма кредита
        double interestRate = 9.99; // процентная ставка
        double interestRateRatio = interestRate / (100 * 12); // коэф проц ставки
        int months12 = 12; // срок (месяцев)
        int months24 = 24; // срок (месяцев)
        int months36 = 36; // срок (месяцев)

        int monthlyPayment12 = bankCalculate.calculate(loanAmount, interestRateRatio, months12); //  ежемесячный платеж сроком на 12 мес
        int monthlyPayment24 = bankCalculate.calculate(loanAmount, interestRateRatio, months24); //  ежемесячный платеж сроком на 24 мес
        int monthlyPayment36 = bankCalculate.calculate(loanAmount, interestRateRatio, months36); //  ежемесячный платеж сроком на 36 мес

        System.out.println("Сумма кредита = " + loanAmount + " руб.");
        System.out.println("Процентная ставка = " + interestRate + " %");
        System.out.println("Ежемесячный платеж при оформлении кредита сроком на " + months12 + " месяцев равен "
                + monthlyPayment12 + " руб.");
        System.out.println("Ежемесячный платеж при оформлении кредита сроком на " + months24 + " месяца равен "
                + monthlyPayment24 + " руб.");
        System.out.println("Ежемесячный платеж при оформлении кредита сроком на " + months36 + " месяцев равен "
                + monthlyPayment36 + " руб.");
    }
}