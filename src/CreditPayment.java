public class CreditPayment {

    public double calculate(double s, double r, double n) {
        double calculate;
        r = r / 12 / 100;
        n = n * 12;
        calculate = s * ((r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1));
        return calculate;

    }
}
