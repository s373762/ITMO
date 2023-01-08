package Obj;

import Classes.Korotishka;
import Enums.KorotiskType;
import Interfaces.Punish;

public class Piyulkin extends Korotishka implements Punish {
    public Piyulkin(){
        super("Piyulkin", 25, KorotiskType.BIG);
    }

    public void punishing(Korotishka k){
        this.describe(this.name + " punish a " + k.getName());
    }
    public void punishing(){
        this.describe(this.name + " punish all Karotishek!");
    }
}
