import java.util.Arrays;

public class ReportTest {
    public static void main(String[] args) {

        IReport report = new SalesReport();

        report = ReportBuilder.buildReport(report,
                Arrays.asList("date", "sort", "csv", "amount"));

        System.out.println(report.generate());

        System.out.println("\n---\n");

        IReport userReport = new UserReport();
        userReport = new PdfExportDecorator(userReport);

        System.out.println(userReport.generate());
    }
}