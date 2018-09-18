import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterAbilitiesTest {

    @Test
    public void shouldHaveDefaultAbilities() {
        Character character = new Character();
        Abilities abilities = character.getAbilities();
        assertEquals(10, abilities.getStrength());
        assertEquals(10, abilities.getDexterity());
        assertEquals(10, abilities.getConstitution());
        assertEquals(10, abilities.getWisdom());
        assertEquals(10, abilities.getIntelligence());
        assertEquals(10, abilities.getCharisma());
    }

    @Test
    public void shouldHaveCorrectModifiersForAbilities() {
        assertEquals(-5, Abilities.modifierForAbility(1));
        assertEquals(-4, Abilities.modifierForAbility(2));
        assertEquals(-4, Abilities.modifierForAbility(3));
        assertEquals(-3, Abilities.modifierForAbility(4));
        assertEquals(-3, Abilities.modifierForAbility(5));
        assertEquals(-2, Abilities.modifierForAbility(6));
        assertEquals(-2, Abilities.modifierForAbility(7));
        assertEquals(-1, Abilities.modifierForAbility(8));
        assertEquals(-1, Abilities.modifierForAbility(9));
        assertEquals(0, Abilities.modifierForAbility(10));
        assertEquals(0, Abilities.modifierForAbility(11));
        assertEquals(1, Abilities.modifierForAbility(12));
        assertEquals(1, Abilities.modifierForAbility(13));
        assertEquals(2, Abilities.modifierForAbility(14));
        assertEquals(2, Abilities.modifierForAbility(15));
        assertEquals(3, Abilities.modifierForAbility(16));
        assertEquals(3, Abilities.modifierForAbility(17));
        assertEquals(4, Abilities.modifierForAbility(18));
        assertEquals(4, Abilities.modifierForAbility(19));
        assertEquals(5, Abilities.modifierForAbility(20));
    }

}
