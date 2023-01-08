package stuff.Pokemons;

import stuff.Moves.*;
import ru.ifmo.se.pokemon.*;

public class Bunnelby extends Pokemon {
    public Bunnelby(String name, int level){
        super(name, level);
        setStats(55,47,52,40,40,41);
        setType(Type.POISON);
        setMove(new DoubleTeam(), new WorkUp(), new DoubleTeam());
    }
}