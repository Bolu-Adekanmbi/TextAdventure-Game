package specialAbilities;
import Interactions.*;
import GameEntities.*;

public class AbsoluteCounter implements SpecialAbility {
    private int damage;
    private int reloadCounter;
    private Attack newAttack;
    
    public int getDamage() {
        return this.damage;
    }

    public boolean reload() {
        // Will create some sort of criteria to reload later
        reloadCounter++;
        return true;
    }

    public boolean counter(Attack opponentAttack) {
        Entity OldAggressor = opponentAttack.getAggressor();
        Entity OldRecipient = opponentAttack.getRecipient();

        opponentAttack.setAggressor(OldRecipient);
        opponentAttack.setRecipient(OldAggressor);

        return true;
    }


}
