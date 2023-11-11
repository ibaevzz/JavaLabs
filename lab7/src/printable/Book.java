package printable;

public class Book implements Printable{
    private final String book;
    public Book(String book){
        this.book = book;
    }
    @Override
    public void print() {
        System.out.println(book);
    }
    public static void printBooks(Printable[] printables){
        for(Printable i: printables){
            if(i instanceof Book){
                i.print();
            }
        }
    }
}
