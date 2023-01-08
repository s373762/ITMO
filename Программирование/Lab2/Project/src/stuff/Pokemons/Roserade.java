package stuff.Pokemons;

import stuff.Moves.*;
import ru.ifmo.se.pokemon.*;

public class Roserade extends Pokemon {
    public Roserade(String name, int level){
        super(name, level);
        setStats(30,30,30,30,30,30);
        setType(Type.GRASS);
        setMove(new Sludge_Bomb(), new Facade(), new SleepPowder(), new SwordDance());
    }
}