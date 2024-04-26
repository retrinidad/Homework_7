public class CharacterPropertiesFlyweight {
    private String font;
    private String color;
    private int size;

    public CharacterPropertiesFlyweight(String font, String color, int size) {
        this.font = font;
        this.color = color;
        this.size = size;
    }
    public String getColor(){
        return color;
    }
    public int getSize(){
        return size;
    }

    public String getFont() {
        return font;
    }

}
