package stuff.Pokemons;

import stuff.Moves.*;
import ru.ifmo.se.pokemon.*;

public class Budew extends Pokemon {
    public Budew(String name, int level){
        super(name, level);
        setStats(100,75,115,90,115,85);
        setType(Type.WATER);
        setMove(new Sludge_Bomb(), new Facade());
    }
}