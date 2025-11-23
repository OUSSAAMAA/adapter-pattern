package computer;

public class Tv  implements  Hdmi{
    @Override
    public void view(byte[] data) {
        System.out.println("+++++++++++++++++++++++ TV +++++++++++++++++++++++");
        String msg = new String(data);
        System.out.println(msg);
        System.out.println("+++++++++++++++++++++++ TV +++++++++++++++++++++++");
    }
}
