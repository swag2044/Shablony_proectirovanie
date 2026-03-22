public class SortingDecorator extends ReportDecorator {

    private String criteria;

    public SortingDecorator(IReport report, String criteria) {
        super(report);
        this.criteria = criteria;
    }

    public String generate() {
        return report.generate() + "\n[Sorted by " + criteria + "]";
    }
}