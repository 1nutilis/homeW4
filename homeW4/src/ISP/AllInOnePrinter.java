package ISP;

public class AllInOnePrinter implements Printable,Scannable,Faxable{
    public void print(String content) {
        System.out.println("Печатать: " + content);
    }

    public void scan(String content) {
        System.out.println("Сканить: " + content);
    }

    public void fax(String content) {
        System.out.println("FAX: " + content);
    }
}
}
