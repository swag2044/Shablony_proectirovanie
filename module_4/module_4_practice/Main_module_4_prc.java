import java.util.Scanner;

public class Main_module_4_prc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DocumentCreator creator = null;

        System.out.println("Choose document type:");
        System.out.println("1 - Report");
        System.out.println("2 - Resume");
        System.out.println("3 - Letter");
        System.out.println("4 - Invoice");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                creator = new ReportCreator();
                break;
            case 2:
                creator = new ResumeCreator();
                break;
            case 3:
                creator = new LetterCreator();
                break;
            case 4:
                creator = new InvoiceCreator();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        creator.openDocument();
    }
}
