public class LotusDort implements DortInterface{
    private DortInterface dort;
    public LotusDort(DortInterface dort) {
        this.dort = dort;
    }
    public String pripravDort() {

        return dort.pripravDort() + "- s lotuskama ";

    }

}
