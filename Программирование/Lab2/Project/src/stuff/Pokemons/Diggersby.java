package stuff.Pokemons;

import stuff.Moves.*;
import ru.ifmo.se.pokemon.*;

public class Diggersby extends Pokemon {
    public Diggersby(String name, int level){
        super(name, level);
        setStats(70,62,67,55,55,56);
        setType(Type.POISON);
        setMove(new WorkUp(), new DoubleTeam());
    }
}