package stuff.Pokemons;

import stuff.Moves.*;
import ru.ifmo.se.pokemon.*;

public class Roselia extends Pokemon {
    public Roselia(String name, int level){
        super(name, level);
        setStats(75,75,55,105,85,30);
        setType(Type.GRASS);
        setMove(new Sludge_Bomb(), new Facade(), new SleepPowder());
    }
}