public class PdfExportDecorator extends ReportDecorator {

    public PdfExportDecorator(IReport report) {
        super(report);
    }

    public String generate() {
        return report.generate() + "\n[Exported to PDF]";
    }
}