package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void createTestByName() {
        Recipe recipe = new Recipe("Leves");
        Recipe recipe2 = new Recipe("Fozelek", "Finom főzelék");
        recipe.addIngredient("Csirke");
        recipe2.addIngredient("krumpli", "víz", "fűszer");
        assertEquals(1, recipe.getIngredients().size());
        assertEquals("Leves", recipe.getName());
        assertNull(recipe.getDescription());
    }

    @Test
    void createTestByNameAndDescription() {
        Recipe recipe = new Recipe("Leves");
        Recipe recipe2 = new Recipe("Fozelek", "Finom főzelék");
        recipe.addIngredient("Csirke");
        recipe2.addIngredient("krumpli", "víz", "fűszer");
        assertEquals("Fozelek", recipe2.getName());
        assertEquals("Finom főzelék", recipe2.getDescription());

    }

    @Test
    void addIngredient(){
        Recipe recipe2 = new Recipe("Fozelek", "Finom főzelék");
        recipe2.addIngredient("hagyma");
        assertEquals(1, recipe2.getIngredients().size());
        assertEquals("hagyma", recipe2.getIngredients().get(0));
    }
    @Test
    void addMoreIngredient(){
        Recipe recipe2 = new Recipe("Fozelek", "Finom főzelék");
        recipe2.addIngredient("hagyma", "alma", "körte");
        assertEquals(3, recipe2.getIngredients().size());
        assertArrayEquals(new String[]{"hagyma", "alma", "körte"}, recipe2.getIngredients().toArray());
    }
}