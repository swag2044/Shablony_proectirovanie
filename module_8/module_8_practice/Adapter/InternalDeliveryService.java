public class InternalDeliveryService implements IInternalDeliveryService {

    public void deliverOrder(String orderId) {
        System.out.println("Internal delivery: Order " + orderId + " shipped");
    }

    public String getDeliveryStatus(String orderId) {
        return "Internal: Delivered";
    }
}