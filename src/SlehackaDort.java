public class SlehackaDort implements DortInterface{
    private DortInterface dort;
    public SlehackaDort(DortInterface dort) {
        this.dort = dort;
    }
    public String pripravDort() {

        return dort.pripravDort() + "- se slehackou ";

    }

}
