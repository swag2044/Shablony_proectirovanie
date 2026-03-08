import java.util.Scanner;

public abstract class ReportGenerator {

    public final void generateReport() {

        fetchData();
        formatData();
        generateHeader();

        if (customerWantsSave()) {
            saveReport();
        }
    }

    protected abstract void fetchData();
    protected abstract void formatData();
    protected abstract void generateHeader();

    protected void saveReport() {
        System.out.println("Отчет сохранен");
    }

    protected boolean customerWantsSave() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Сохранить отчет? yes/no");

        String answer = sc.nextLine();

        return answer.equalsIgnoreCase("yes");
    }
}