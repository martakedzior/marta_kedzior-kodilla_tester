public class Book {
    private String author;
    private String title;

    public Book(String author, String title){
        this.title = title;
        this.author = author;
    }

    public static Book of(String author, String title){
        Book book = new Book(author, title);
        return book;
    }

    public static void main(String[] args){
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book.author + " --> " + book.title);
    }
}


