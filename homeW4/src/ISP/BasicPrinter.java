package ISP;

public class BasicPrinter implements Printable{
    public void print(String content) {
        System.out.println("Печатать: " + content);
    }
}
