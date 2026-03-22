public class LogisticsAdapterA implements IInternalDeliveryService {

    private ExternalLogisticsServiceA serviceA;

    public LogisticsAdapterA(ExternalLogisticsServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public void deliverOrder(String orderId) {
        try {
            int id = Integer.parseInt(orderId);
            serviceA.shipItem(id);
        } catch (Exception e) {
            System.out.println("Error in AdapterA: " + e.getMessage());
        }
    }

    public String getDeliveryStatus(String orderId) {
        return serviceA.trackShipment(Integer.parseInt(orderId));
    }
}