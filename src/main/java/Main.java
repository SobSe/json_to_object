import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "data.json";
        String json = null;

        Reader reader = new Reader();
        json = reader.readString(inputFileName);

        ParserJSON parserJSON = new ParserJSON();
        List<Employee> employees = parserJSON.jsonToList(json);

        employees.forEach(System.out::println);
    }

}
