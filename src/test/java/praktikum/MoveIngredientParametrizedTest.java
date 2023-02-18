package praktikum;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MoveIngredientParametrizedTest {
    private static Burger burger;
    private final Ingredient ingredient;
    private final int newIndex;
    private final int index;



    public MoveIngredientParametrizedTest(Ingredient expectedIngredient, int newIndex, int index) {
        this.ingredient = expectedIngredient;
        this.newIndex = newIndex;
        this.index = index;
    }

    @Parameterized.Parameters
    public static Object[][] moveIngredientData() {
        return new Object[][]{
                {new Ingredient(IngredientType.SAUCE, "sour cream", 200), 5, 1},
                {new Ingredient(IngredientType.FILLING, "sausage", 300), 2, 4},
                {new Ingredient(IngredientType.SAUCE, "sour cream", 200), 0, 5},

                {new Ingredient(IngredientType.FILLING, "cutlet", 100), 3, 4},
                {new Ingredient(IngredientType.FILLING, "dinosaur", 200), 1, 5},
                {new Ingredient(IngredientType.SAUCE, "chili sauce", 300), 3, 3},

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
    public void moveIngredientTest() {
        burger.moveIngredient(index, newIndex);
        assertEquals(ingredient.name, burger.ingredients.get(newIndex).name);
        assertEquals(ingredient.type, burger.ingredients.get(newIndex).type);
        assertEquals(0, Float.compare(ingredient.price, burger.ingredients.get(newIndex).price));


    }

}
