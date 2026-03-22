public class DateFilterDecorator extends ReportDecorator {

    private String fromDate;
    private String toDate;

    public DateFilterDecorator(IReport report, String fromDate, String toDate) {
        super(report);
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String generate() {
        return report.generate() + "\n[Filtered from " + fromDate + " to " + toDate + "]";
    }
}