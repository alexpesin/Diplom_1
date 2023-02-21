package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

public class IngredientTest {


    @Test
    public void getIngredientPriceTest() {
        Ingredient ingredient = new Ingredient(FILLING, "hot sauce", 100);
        float expectedIngredientPrice = 100;
        float actualIngredientPrice = ingredient.getPrice();

        assertEquals(0, Float.compare(expectedIngredientPrice, actualIngredientPrice));
    }

    @Test
    public void getIngredientNameTest() {
        Ingredient ingredient = new Ingredient(SAUCE, "SAUCE_test", 1054);
        String expectedName = "SAUCE_test";
        String actualName = ingredient.getName();

        assertEquals(expectedName, actualName);
    }

    @Test
    public void getIngredientSauceTypeTest() {
        Ingredient ingredient = new Ingredient(SAUCE, "SAUCE_type", 1);
        IngredientType expectedType = IngredientType.valueOf("SAUCE");
        IngredientType actualType = ingredient.getType();

        assertEquals(expectedType, actualType);
    }

    @Test
    public void getIngredientFillingTypeTest() {
        Ingredient ingredient = new Ingredient(FILLING, "FILLING_type", 1);
        IngredientType expectedType = IngredientType.valueOf("FILLING");
        IngredientType actualType = ingredient.getType();

        assertEquals(expectedType, actualType);
    }
}