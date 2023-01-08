package Classes;

import Enums.KorotiskType;
import Interfaces.PersonIn;

public class Korotishka implements PersonIn{
    protected String name;
    protected int age;
    protected KorotiskType type;

    public Korotishka(String name, int age, KorotiskType type){
        this.name = name;
        this.age = age;
        this.type = type;
    }
    public Korotishka(String name, int age){
        this.name = name;
        this.age = age;
        this.type = KorotiskType.NORMAL;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void walk(){
        this.describe(this.name + " walking!");
    }

    public void singAsong(){
        this.describe(this.name + " singing!");
    }

    public void sleep(){
        this.describe(this.name + " sleeping!");
    }

    public void wakeUp(){
        this.describe(this.name + " wake up!");
    }

    public void writing(String txt){
        this.describe(this.name + " writed a \"" + txt + "\" on paper!");
    }

    @Override
    public void info() {
        this.describe("I am a sample korotishka!");
    }
}
