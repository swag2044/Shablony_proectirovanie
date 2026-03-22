public class LogisticsAdapterB implements IInternalDeliveryService {

    private ExternalLogisticsServiceB serviceB;

    public LogisticsAdapterB(ExternalLogisticsServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public void deliverOrder(String orderId) {
        serviceB.sendPackage(orderId);
    }

    public String getDeliveryStatus(String orderId) {
        return serviceB.checkPackageStatus(orderId);
    }
}