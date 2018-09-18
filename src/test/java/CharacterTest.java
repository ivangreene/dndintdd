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

}
