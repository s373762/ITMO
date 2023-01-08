package stuff;

import ru.ifmo.se.pokemon.*;
import stuff.Pokemons.*;
import stuff.Moves.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Budew a1 = new Budew("Jirachi", 1);
        Bunnelby a2 = new Bunnelby("Bunnelby", 1);
        Diggersby a3 = new Diggersby("Diggersby", 1);

        Jirachi f1 = new Jirachi("Jirachi", 1);
        Roselia f2 = new Roselia("Roselia", 1);
        Roserade f3 = new Roserade("Roserade", 1);

        b.addAlly(a1);
        b.addAlly(a2);
        b.addAlly(a3);

        b.addFoe(f1);
        b.addFoe(f2);
        b.addFoe(f3);

        b.go();

    }
}
