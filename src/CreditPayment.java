public class CreditPayment {

    public double calculate(double summa, double percent, double term) {
        double calculate;
        percent = percent / 12 / 100;;
        term = term * 12;
        calculate = summa * ((percent * Math.pow((1 + percent), term)) / (Math.pow((1 + percent), term) - 1));
        return calculate;

    }
}
