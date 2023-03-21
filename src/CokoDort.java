public class CokoDort implements DortInterface {
    private DortInterface dort;
    public CokoDort(DortInterface dort) {
        this.dort = dort;
    }
    public String pripravDort() {

        return dort.pripravDort() + "- s cokoladou ";

    }

}
