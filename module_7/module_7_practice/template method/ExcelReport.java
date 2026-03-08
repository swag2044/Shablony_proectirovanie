public class ExcelReport extends ReportGenerator {

    protected void fetchData() {
        System.out.println("Получение данных для Excel");
    }

    protected void formatData() {
        System.out.println("Форматирование Excel");
    }

    protected void generateHeader() {
        System.out.println("Создание заголовка Excel");
    }
}