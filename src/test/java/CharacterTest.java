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

}
