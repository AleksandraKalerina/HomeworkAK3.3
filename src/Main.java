public class Main {
    public static void main(String[] args) {
        CreditPayment service = new CreditPayment();

        System.out.println();
        System.out.println("Ежемесячный платеж равен: " + (int)service.calculate(1_000_000, 9.99, 1));

        System.out.println();
        System.out.println("Ежемесячный платеж равен: " + (int)service.calculate(1_000_000, 9.99, 2));

        System.out.println();
        System.out.println("Ежемесячный платеж равен: " + (int)service.calculate(1_000_000, 9.99, 3));
    }
}
