public class CreditPaymentService {
    int calculate(double O, double S, double P) {
        double EP = O * (S / (1 - Math.pow((1 + S), -P)));
        return (int) EP;

        // O - сумма кредита
        // S - процентная ставка
        // P - количество месяцев
        // EP - ежемесячный платеж
    }

}
