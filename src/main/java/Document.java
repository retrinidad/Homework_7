import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Document {
    private StringBuilder text;

    public Document() {
        this.text = new StringBuilder();
    }

    public void insert(char c, CharacterPropertiesFlyweight props) {
        text.append(c);
    }

    public void saveToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text.toString());
        } catch (IOException e) {
            System.out.println("Error in saving file");
            e.printStackTrace();
        }
    }

    public void loadFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line);
            }
        } catch (IOException e) {
            System.out.println("Error while loading file");
            e.printStackTrace();
        }
    }

    StringBuilder getText(){
        return text;
    }
}
