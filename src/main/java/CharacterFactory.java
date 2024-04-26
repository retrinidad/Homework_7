import java.util.HashMap;

public class CharacterFactory {
    private HashMap<String, CharacterPropertiesFlyweight> characters = new HashMap<>();

    public CharacterPropertiesFlyweight getCharacterProps(String font, String color, int size) {
        if (characters.containsKey(font + " " + color + " " + size)) {
            return characters.get(font + " " + color + " " + size);
        } else {
            CharacterPropertiesFlyweight charprops = new CharacterPropertiesFlyweight(font, color, size);
            characters.put(font + " " + color + " " + size, charprops);
            return charprops;
        }
    }
}
