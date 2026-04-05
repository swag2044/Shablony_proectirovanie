public class File extends FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Файл: " + name + " (" + size + " KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}