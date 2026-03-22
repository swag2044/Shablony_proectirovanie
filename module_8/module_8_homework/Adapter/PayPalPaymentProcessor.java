public class PayPalPaymentProcessor implements IPaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }
}