import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public String readString(String fileName) {
        String json = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            StringBuilder jsonBuilder = new StringBuilder();
            String readLine;
            while ((readLine = reader.readLine()) != null) {
                jsonBuilder.append(readLine);
            }
            json = jsonBuilder.toString();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return json;
    }
}
