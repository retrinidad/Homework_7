public class Character {
    private char character;
    private CharacterPropertiesFlyweight characterProperties;

    public Character(char character, CharacterPropertiesFlyweight characterProperties) {
        this.character = character;
        this.characterProperties = characterProperties;
    }
}
