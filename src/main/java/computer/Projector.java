package computer;

public class Projector implements Vga {
    @Override
    public void print(String s) {
        System.out.println("......................Projector is Being attached.........................");
        System.out.println(s);
        System.out.println("..........................................................................");
    }
}
