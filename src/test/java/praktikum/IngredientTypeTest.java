package praktikum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class IngredientTypeTest {

    @Test
    public void hasIngredientTypeValuesTest() {

        List<String> expectedTypeNameList = List.of("SAUCE", "FILLING");
        List<String> actualTypeNamesList = new ArrayList<>();
        for (IngredientType type : IngredientType.values()) {
            actualTypeNamesList.add(type.name());
        }
        assertEquals(expectedTypeNameList, actualTypeNamesList);

    }

    @Test
    public void getIngredientTypeSizeTest() {

        int expectedSize = 2;
        List<String> actualTypeNamesList = new ArrayList<>();
        for (IngredientType type : IngredientType.values()) {
            actualTypeNamesList.add(type.name());
        }
        int actualSize = actualTypeNamesList.size();

        assertEquals(expectedSize, actualSize);
    }


}