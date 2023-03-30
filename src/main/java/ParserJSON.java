import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

public class ParserJSON {
    public List<Employee> jsonToList(String json) {
        List<Employee> employees = new ArrayList<>();

        try {
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(json);
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();

            for (Object object :  jsonArray) {
                JSONObject jsonObject = (JSONObject) object;
                Employee employee = gson.fromJson(jsonObject.toJSONString(), Employee.class);
                employees.add(employee);
            }

        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return employees;
    }
}
