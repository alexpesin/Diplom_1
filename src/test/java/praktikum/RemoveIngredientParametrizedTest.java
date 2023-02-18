package praktikum;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RemoveIngredientParametrizedTest {
    private static Burger burger;
    private final Ingredient ingredient;
    private final int ingredientIndex;
    private final int expectedIngredientsListSize;



    public RemoveIngredientParametrizedTest(Ingredient expectedIngredient, int index, int size) {
        this.ingredient = expectedIngredient;
        this.ingredientIndex = index;
        this.expectedIngredientsListSize = size;
    }

    @Parameterized.Parameters
    public static Object[][] removeIngredientData() {
        return new Object[][]{
                {new Ingredient(IngredientType.SAUCE, "hot sauce", 100), 5, 5},
                {new Ingredient(IngredientType.SAUCE, "sour cream", 200), 2, 4},
                {new Ingredient(IngredientType.SAUCE, "chili sauce", 300), 3, 3},

                {new Ingredient(IngredientType.FILLING, "cutlet", 100), 1, 2},
                {new Ingredient(IngredientType.FILLING, "dinosaur", 200), 0, 1},
                {new Ingredient(IngredientType.FILLING, "sausage", 300), 0, 0},

        };
    }

    @BeforeClass
    public static void setUp() {
        burger = new Burger();
        List<Ingredient> ingredients = List.of(
                new Ingredient(IngredientType.SAUCE, "hot sauce", 100),
                new Ingredient(IngredientType.SAUCE, "sour cream", 200),
                new Ingredient(IngredientType.SAUCE, "chili sauce", 300),

                new Ingredient(IngredientType.FILLING, "cutlet", 100),
                new Ingredient(IngredientType.FILLING, "dinosaur", 200),
                new Ingredient(IngredientType.FILLING, "sausage", 300));

        for (Ingredient value : ingredients) {
            burger.addIngredient(value);
        }
    }

    @Test
    public void removeIngredientTest() {
        burger.removeIngredient(ingredientIndex);
        assertEquals(expectedIngredientsListSize, burger.ingredients.size());
        assertFalse(burger.ingredients.contains(ingredient));

    }
}

