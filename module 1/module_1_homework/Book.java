class Book{
    private String name;
    private String author;
    private int isbn;
    private int kol;


public Book(String name,String author,int isbn,int kol){
    this.name = name;
    this.author = author;
    this.isbn = isbn;
    this.kol = kol;
}

public String getName(){
    return name;

}

public String getAuthor(){
    return author;

}
public int getIsbn(){
    return isbn;
}
public int getKol(){
    return kol;
}

public void increaseKol(int n){kol += n;}
public void decreaseKol(int n){kol -= n;}

}
