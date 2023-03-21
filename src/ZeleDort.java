public class ZeleDort implements DortInterface {
    private DortInterface dort;
    public ZeleDort(DortInterface dort) {
        this.dort = dort;
    }
    public String pripravDort() {

        return dort.pripravDort() + "- s zele ";

    }


}
