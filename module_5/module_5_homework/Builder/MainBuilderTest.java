

public class MainBuilderTest {
    public static void main(String[] args) {
        ReportDirector director = new ReportDirector();

        IReportBuilder textBuilder = new TextReportBuilder();
        director.constructReport(textBuilder);
        Report textReport = textBuilder.getReport();
        textReport.showReport();

        System.out.println("\n--- HTML Report ---\n");

        IReportBuilder htmlBuilder = new HtmlReportBuilder();
        director.constructReport(htmlBuilder);
        Report htmlReport = htmlBuilder.getReport();
        htmlReport.showReport();
    }
}
