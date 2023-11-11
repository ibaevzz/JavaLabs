package printable;

public class Magazine implements Printable{
    private final String magazine;
    public Magazine(String magazine){
        this.magazine = magazine;
    }
    @Override
    public void print() {
        System.out.println(magazine);
    }
    public static void printMagazine(Printable[] printables){
        for(Printable i: printables){
            if(i instanceof Magazine){
                i.print();
            }
        }
    }
}
