package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void getBunNameTest() {
        // Arrange
        Bun bun = new Bun("black bun", 100);
        String expectedBunName = "black bun";
        // Act
        String actualBunName = bun.getName();
        // Assert
        assertEquals(expectedBunName, actualBunName);

    }


    @Test
    public void getBunPriceTest() {
        Bun bun = new Bun("red bun", 300);
        float expectedBunPrice = 300;
        float actualBunPrice = bun.getPrice();

        assertEquals(0, Float.compare(expectedBunPrice, actualBunPrice));

    }

}