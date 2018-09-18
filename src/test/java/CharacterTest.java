import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {

    @Test
    public void shouldSetAndGetName() {
        Character character = new Character();
        character.setName("foo");
        assertEquals("foo", character.getName());
    }

    @Test
    public void shouldSetAndGetAlignment() {
        Character character = new Character();

        character.setAlignment(Alignment.GOOD);
        assertEquals(Alignment.GOOD, character.getAlignment());

        character.setAlignment("GOOD");
        assertEquals(Alignment.GOOD, character.getAlignment());
    }

    @Test
    public void shouldHaveDefaultArmorClass() {
        Character character = new Character();
        assertEquals(10, character.getArmorClass());
    }

    @Test
    public void shouldHaveDefaultHitPoints() {
        Character character = new Character();
        assertEquals(5, character.getHitPoints());
    }

    @Test
    public void canAttackAndBeDamaged() {
        Character character1 = new Character();
        Character character2 = new Character();

        // roll of 5
        int hpBeforeAttack = character2.getHitPoints();
        character1.attack(character2, 5);
        assertEquals(hpBeforeAttack, character2.getHitPoints());

        // roll of 10
        hpBeforeAttack = character2.getHitPoints();
        character1.attack(character2, 10);
        assertEquals(hpBeforeAttack - 1, character2.getHitPoints());

        // roll of 20
        hpBeforeAttack = character2.getHitPoints();
        character1.attack(character2, 20);
        assertEquals(hpBeforeAttack - 2, character2.getHitPoints());
    }

}
