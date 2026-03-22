public class LogisticsAdapterC implements IInternalDeliveryService {

    private ExternalLogisticsServiceC serviceC;

    public LogisticsAdapterC(ExternalLogisticsServiceC serviceC) {
        this.serviceC = serviceC;
    }

    public void deliverOrder(String orderId) {
        serviceC.dispatch(orderId);
    }

    public String getDeliveryStatus(String orderId) {
        return serviceC.status(orderId);
    }
}