import computer.*;
import computer.adapter.HdmiVgaAdapter;

public class Test {
    public static void main(String[] args) {
        CentralUnit centralUnit= new CentralUnit();
//        centralUnit.setVga(new Monitor());
//        centralUnit.setVga(new Projector());



        //GAOL LNKING CENTRAL UNIT TO A TV BOTH IMPLEMENT DIFERENT INTERFACES THUS THE ADAPTER
        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new Tv());

        centralUnit.setVga(hdmiVgaAdapter);
        centralUnit.print("");

    }
}
