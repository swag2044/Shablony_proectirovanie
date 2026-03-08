public class HtmlReport extends ReportGenerator {

    protected void fetchData() {
        System.out.println("Получение данных для HTML");
    }

    protected void formatData() {
        System.out.println("Форматирование HTML");
    }

    protected void generateHeader() {
        System.out.println("Создание заголовка HTML");
    }
}