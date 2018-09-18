import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {

    @Test
    public void shouldSetAndGetName() {
        Character character = new Character();
        character.setName("foo");
        assertEquals("foo", character.getName());
    }

}
