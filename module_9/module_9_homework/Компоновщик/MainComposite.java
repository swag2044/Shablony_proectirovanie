public class MainComposite {
    public static void main(String[] args) {

        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);
        File file3 = new File("file3.txt", 300);

        Directory folder1 = new Directory("Документы");
        Directory folder2 = new Directory("Фото");
        Directory root = new Directory("Главная папка");

        folder1.add(file1);
        folder1.add(file2);

        folder2.add(file3);

        root.add(folder1);
        root.add(folder2);

        root.display("");

        System.out.println("\nОбщий размер: " + root.getSize() + " KB");
    }
}