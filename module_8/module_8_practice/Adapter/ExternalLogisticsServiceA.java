public class ExternalLogisticsServiceA {

    public void shipItem(int itemId) {
        System.out.println("Service A shipping item " + itemId);
    }

    public String trackShipment(int shipmentId) {
        return "Service A: In transit";
    }
}