public class ReportDirector {

    public void constructReport(IReportBuilder builder, ReportStyle style) {
        builder.setStyle(style);
        builder.setHeader("Annual Report 2026");
        builder.setContent("Main content of report");
        builder.addSection("Statistics", "Dynamic data here");
        builder.setFooter("Company © 2026");
    }
}
