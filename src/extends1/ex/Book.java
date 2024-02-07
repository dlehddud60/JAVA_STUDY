package extends1.ex;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();//부모꺼 먼저 출력 후 내꺼 출력
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }
}
