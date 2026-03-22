public class ExternalLogisticsServiceC {
    public void dispatch(String code) {
        System.out.println("Service C dispatch: " + code);
    }

    public String status(String code) {
        return "Service C: Pending";
    }
}