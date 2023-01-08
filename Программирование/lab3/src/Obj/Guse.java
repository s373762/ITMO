package Obj;

import Classes.Korotishka;
import Enums.KorotiskType;
import Interfaces.*;

public class Guse extends Korotishka implements PlayOnFlute {
    public Guse(){
        super("Guse", 20, KorotiskType.BIG);
    }

    public void playing(){
        this.describe(this.name + " give a flute and played!");
    }

    public void simfonia(){
        this.writing("Космическая симфония");
    }
}
