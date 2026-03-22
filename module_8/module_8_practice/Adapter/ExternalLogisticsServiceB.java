public class ExternalLogisticsServiceB {

    public void sendPackage(String packageInfo) {
        System.out.println("Service B sending package " + packageInfo);
    }

    public String checkPackageStatus(String trackingCode) {
        return "Service B: Delivered";
    }
}