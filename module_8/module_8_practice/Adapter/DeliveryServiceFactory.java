public class DeliveryServiceFactory {

    public static IInternalDeliveryService getService(String type) {

        switch (type) {
            case "internal":
                return new InternalDeliveryService();
            case "A":
                return new LogisticsAdapterA(new ExternalLogisticsServiceA());
            case "B":
                return new LogisticsAdapterB(new ExternalLogisticsServiceB());
            case "C":
                return new LogisticsAdapterC(new ExternalLogisticsServiceC());
            default:
                throw new IllegalArgumentException("Unknown service type");
        }
    }
}