package computer.adapter;

import computer.Hdmi;
import computer.Vga;

public class HdmiVgaAdapter implements Vga {
    Hdmi hdmi;
    @Override
    public void print(String s) {
        byte [] msg = s.getBytes();
        System.out.println("*********** HdmiVgaAdapter **************");
        hdmi.view(msg);
        System.out.println("*********** HdmiVgaAdapter **************");

    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }

}
