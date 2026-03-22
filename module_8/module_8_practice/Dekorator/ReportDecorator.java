public abstract class ReportDecorator implements IReport {
    protected IReport report;

    public ReportDecorator(IReport report) {
        this.report = report;
    }

    public String generate() {
        return report.generate();
    }
}