package praktikum;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AddIngredientParametrizedTest {
    private static Burger burger;
    private final Ingredient ingredient;
    private final int ingredientIndex;
    private final int expectedIngredientsListSize;


    public AddIngredientParametrizedTest(Ingredient expectedIngredient, int index, int size) {
        this.ingredient = expectedIngredient;
        this.ingredientIndex = index;
        this.expectedIngredientsListSize = size;
    }

    @Parameterized.Parameters
    public static Object[][] addIngredientData() {
        return new Object[][]{{new Ingredient(IngredientType.SAUCE, "hot sauce", 100), 0, 1}, {new Ingredient(IngredientType.SAUCE, "sour cream", 200), 1, 2}, {new Ingredient(IngredientType.SAUCE, "chili sauce", 300), 2, 3},

                {new Ingredient(IngredientType.FILLING, "cutlet", 100), 3, 4}, {new Ingredient(IngredientType.FILLING, "dinosaur", 200), 4, 5}, {new Ingredient(IngredientType.FILLING, "sausage", 300), 5, 6},};
    }

    @BeforeClass
    public static void setUp() {
        burger = new Burger();
    }

    @Test
    public void addIngredientTest() {
        burger.addIngredient(ingredient);
        assertEquals(ingredient.name, burger.ingredients.get(ingredientIndex).getName());
        assertEquals(ingredient.type, burger.ingredients.get(ingredientIndex).getType());
        assertEquals(0, Float.compare(ingredient.price, burger.ingredients.get(ingredientIndex).getPrice()));

        assertEquals(expectedIngredientsListSize, burger.ingredients.size());


    }
}
