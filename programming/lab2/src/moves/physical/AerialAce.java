package moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(
            Type.FLYING, // type
            60, // power
            1 // accuracy
        );
    }

    @Override
    protected String describe() {
        return "is using Aerial Ace";
    }
}
