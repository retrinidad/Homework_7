import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyweightTest {

    @Test
    public void test1() {
        Document test_document = new Document();
        CharacterFactory characterFactory = new CharacterFactory();

        CharacterPropertiesFlyweight variation1 = characterFactory.getCharacterProps("Arial","Red",12);

        assertEquals("Arial",variation1.getFont());
        assertEquals("Red",variation1.getColor());
        assertEquals(12,variation1.getSize());
    }


}
