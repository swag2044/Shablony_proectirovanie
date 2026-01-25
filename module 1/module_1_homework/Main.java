public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Выбраться из острова Эпштейна","Justin Bieber",111,3);
        Book book2 = new Book("P Diddy:Возвращение домой","P Shawn Diddy",222,2);
        Book book3 = new Book("P Diddy vs Epstein","Olzhas Sovetbekov",333,4);

        Reader reader1 = new Reader("Olzhas",2044);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.getBooks();


        library.registerReader(reader1);

        library.giveBook(book3,reader1);

        library.getBooks();


        library.returnBook(book3);
        library.removeBook(book2);

        library.getBooks();

        
    }
    
}
