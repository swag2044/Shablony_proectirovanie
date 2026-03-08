public class PdfReport extends ReportGenerator {

    protected void fetchData() {
        System.out.println("Получение данных для PDF");
    }

    protected void formatData() {
        System.out.println("Форматирование PDF");
    }

    protected void generateHeader() {
        System.out.println("Создание заголовка PDF");
    }
}