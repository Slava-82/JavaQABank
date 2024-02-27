public class CreditPaymentService {
    public int calculate(double loanAmount, double interestRate, double months) {
        double monthlyPayment = loanAmount * (interestRate / (1 - Math.pow((1 + interestRate), -months)));
        return (int) monthlyPayment;

        //  loanAmount- сумма кредита
        //  interestRate - процентная ставка
        //  months - количество месяцев
        //  monthlyPayment - ежемесячный платеж
    }
}
