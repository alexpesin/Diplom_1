package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

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

    /*@Test
    public void getEmptyNameTest() {
        // Arrange
        Bun bun = new Bun("", 0);
        String expectedBunName = "";
        // Act
        String actualBunName = bun.getName();
        // Assert
        assertEquals(expectedBunName, actualBunName);

    }*/

    @Test
    public void getBunPriceTest() {
        Bun bun = new Bun("red bun", 300);
        float expectedBunPrice = 300;
        float actualBunPrice = bun.getPrice();

       //assertEquals(expectedBunPrice, actualBunPrice);  // java.lang.AssertionError: Use assertEquals(expected, actual, delta) to compare floating-point numbers
        assertEquals(0, Float.compare(expectedBunPrice, actualBunPrice));

    }

    /*@Test
    public void getEmptyPrice() {
        Bun bun = new Bun("red bun", 0);
        float expectedBunPrice = 0;
        float actualBunPrice = bun.getPrice();

        //assertEquals(expectedBunPrice, actualBunPrice);  // java.lang.AssertionError: Use assertEquals(expected, actual, delta) to compare floating-point numbers
        assertEquals(0, Float.compare(expectedBunPrice, actualBunPrice));

    }*/
}