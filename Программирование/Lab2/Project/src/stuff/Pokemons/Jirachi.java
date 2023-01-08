package stuff.Pokemons;

import stuff.Moves.*;
import ru.ifmo.se.pokemon.*;

public class Jirachi extends Pokemon {
    public Jirachi(String name, int level){
        super(name, level);
        setStats(90,92,87,75,85,76);
        setType(Type.POISON, Type.GROUND);
        setMove(new Thunderbolt(), new DazzlingGleam(), new DazzlingGleam());
    }
}