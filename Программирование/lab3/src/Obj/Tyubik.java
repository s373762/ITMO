package Obj;
import Classes.*;

import Enums.KorotiskType;
import Interfaces.*;

import java.awt.*;

public class Tyubik extends Korotishka implements Painting {
    public Tyubik() {
        super("Tyubik", 18, KorotiskType.NORMAL);
    }

    public void paint(String paintName){
        this.describe(this.name + " Painted a " + paintName + "!");
    }
}
