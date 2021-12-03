package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {
    private String name;
    public List<String> ingredients = new ArrayList<>();
    private String description;

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addIngredient(String s, String... more){
        ingredients.add(s);
        ingredients.addAll(Arrays.asList(more));
    }

}
