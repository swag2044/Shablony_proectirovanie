import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Reader> readers = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Книга "+book.getName()+" добавлен в библиотеку");

    }
    public void removeBook(Book book){
        books.remove(book);
        System.out.println("Книга "+book.getName()+" убран из библиотеки");
    }
    public void registerReader(Reader reader){
        readers.add(reader);
        System.out.println("Читатель " + reader.getName() + " добавлен в систему библиотеки");
    }
    public void giveBook(Book book,Reader reader){
        if(book.getKol() > 0){
            book.decreaseKol(1);
            System.out.println(book.getName() + " передана читателю " + reader.getName());
        }else {System.out.println("книги "+book.getName() +" в наличии нету");}

        
           

        }
    public void returnBook(Book book){
        if(books.contains(book)){
            book.increaseKol(1);
        }
        System.out.println("Книгу " + book.getName() +" вернули в библиотеку");

    }
    public ArrayList<Book> getBooks(){
        
        System.out.println("Книги в библиотеке: " + books);
        return books;

    }
    }




    

