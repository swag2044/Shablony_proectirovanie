import java.util.List;

public class ReportBuilder {

    public static IReport buildReport(IReport baseReport, List<String> options) {

        IReport report = baseReport;

        for (String option : options) {
            switch (option) {
                case "date":
                    report = new DateFilterDecorator(report, "2026-03-01", "2026-03-31");
                    break;
                case "sort":
                    report = new SortingDecorator(report, "date");
                    break;
                case "csv":
                    report = new CsvExportDecorator(report);
                    break;
                case "pdf":
                    report = new PdfExportDecorator(report);
                    break;
                case "amount":
                    report = new AmountFilterDecorator(report, 600);
                    break;
            }
        }

        return report;
    }
}