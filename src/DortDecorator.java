import Dorticek.CokoDort;
import Dorticek.Dort;
import Dorticek.LotusDort;
import Dorticek.SlehackaDort;

public class DortDecorator {
    public static void main(String[] args){
        String dort = new CokoDort(new LotusDort(new SlehackaDort(new Dort()))).pripravDort();
        System.out.println(dort);




    }

}
