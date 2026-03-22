public class DeliveryTest {
    public static void main(String[] args) {

        IInternalDeliveryService service;

        service = DeliveryServiceFactory.getService("internal");
        service.deliverOrder("101");
        System.out.println(service.getDeliveryStatus("101"));

        System.out.println();

        service = DeliveryServiceFactory.getService("A");
        service.deliverOrder("202");
        System.out.println(service.getDeliveryStatus("202"));

        System.out.println();

        service = DeliveryServiceFactory.getService("B");
        service.deliverOrder("XYZ");
        System.out.println(service.getDeliveryStatus("XYZ"));
    }
}