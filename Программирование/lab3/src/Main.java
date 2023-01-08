import Classes.Korotishka;
import Obj.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Услыхав богатырский храп, который доносился из каюты Пилюлькина, все коротышки вылезли из своих постелей!"); nl();
        Tyubik tyu = new Tyubik();
        tyu.paint("лунные пейзажи");
        Guse guse = new Guse();
        guse.playing();
        guse.simfonia();
        Piyulkin pul = new Piyulkin();
        pul.wakeUp();
        pul.punishing(guse);
            Korotishka nez = new Korotishka("Neznayka", 23);
        nez.singAsong();
    }
    public static void nl() {
        System.out.println();
    }
}