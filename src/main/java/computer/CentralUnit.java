package computer;

public class CentralUnit {
    private Vga vga;

    public void print(String s){
        System.out.println("*******************CentralUnit**********************");
        vga.print(s);
        System.out.println("*******************CentralUnit**********************");
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }
}
