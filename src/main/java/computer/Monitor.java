package computer;

public class Monitor implements Vga {
    @Override
    public void print(String s) {
        System.out.println("================= Monitor is being attached ===================");
        System.out.println(s);
        System.out.println("===============================================================");

    }
}
