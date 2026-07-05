package src;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import src.classes.Product;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonWriter {

    private final String filePath = "src\\data.json"; // where the JSON file lives
    private final Gson gson = new Gson(); // tool that converts Java <-> JSON

    // Step 3: save a list of tasks into the JSON file
    public void save(List<Product> tasks) {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(tasks, writer);
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    // Step 4: load the list of tasks from the JSON file
    public List<Product> load() {
        try (FileReader reader = new FileReader(filePath)) {
            Type taskListType = new TypeToken<List<Product>>() {}.getType();
            List<Product> tasks = gson.fromJson(reader, taskListType);
            return tasks != null ? tasks : new ArrayList<>();
        } catch (IOException e) {
            System.out.println("No existing data found, starting fresh.");
            return new ArrayList<>();
        }
    }
}
