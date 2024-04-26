public class FlyweightDriver {
    public static void main(String[] args) {
        Document test_document = new Document();
        CharacterFactory characterFactory = new CharacterFactory();

        CharacterPropertiesFlyweight variation1 = characterFactory.getCharacterProps("Arial","Red",12);
        CharacterPropertiesFlyweight variation2 = characterFactory.getCharacterProps("Calibri","Blue",14);
        CharacterPropertiesFlyweight variation3 = characterFactory.getCharacterProps("Verdana","Black",16);
        CharacterPropertiesFlyweight variation4 = characterFactory.getCharacterProps("Arial","Black",14);

        test_document.insert('H', variation1);
        test_document.insert('e', variation1);
        test_document.insert('l', variation1);
        test_document.insert('l', variation1);
        test_document.insert('o', variation1);
        test_document.insert('W', variation1);
        test_document.insert('o', variation1);
        test_document.insert('r', variation1);
        test_document.insert('l', variation1);
        test_document.insert('d', variation1);
        test_document.insert('C', variation1);
        test_document.insert('S', variation1);
        test_document.insert('5', variation1);
        test_document.insert('8', variation1);
        test_document.insert('0', variation1);
        test_document.insert('0', variation1);

        test_document.insert('H', variation2);
        test_document.insert('e', variation2);
        test_document.insert('l', variation2);
        test_document.insert('l', variation2);
        test_document.insert('o', variation2);
        test_document.insert('W', variation2);
        test_document.insert('o', variation2);
        test_document.insert('r', variation2);
        test_document.insert('l', variation2);
        test_document.insert('d', variation2);
        test_document.insert('C', variation2);
        test_document.insert('S', variation2);
        test_document.insert('5', variation2);
        test_document.insert('8', variation2);
        test_document.insert('0', variation2);
        test_document.insert('0', variation2);

        test_document.insert('H', variation3);
        test_document.insert('e', variation3);
        test_document.insert('l', variation3);
        test_document.insert('l', variation3);
        test_document.insert('o', variation3);
        test_document.insert('W', variation3);
        test_document.insert('o', variation3);
        test_document.insert('r', variation3);
        test_document.insert('l', variation3);
        test_document.insert('d', variation3);
        test_document.insert('C', variation3);
        test_document.insert('S', variation3);
        test_document.insert('5', variation3);
        test_document.insert('8', variation3);
        test_document.insert('0', variation3);
        test_document.insert('0', variation3);

        test_document.insert('H', variation4);
        test_document.insert('e', variation4);
        test_document.insert('l', variation4);
        test_document.insert('l', variation4);
        test_document.insert('o', variation4);
        test_document.insert('W', variation4);
        test_document.insert('o', variation4);
        test_document.insert('r', variation4);
        test_document.insert('l', variation4);
        test_document.insert('d', variation4);
        test_document.insert('C', variation4);
        test_document.insert('S', variation4);
        test_document.insert('5', variation4);
        test_document.insert('8', variation4);
        test_document.insert('0', variation4);
        test_document.insert('0', variation4);

        test_document.saveToFile("SongServiceDocument.txt");

        System.out.println(test_document.getText());

    }
}
