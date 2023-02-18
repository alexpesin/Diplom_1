package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    private Ingredient ingredient;
    @Mock
    private Bun bun;

    public List<Ingredient> ingredients = new ArrayList<>();

    @Spy
    private Burger burger = Mockito.mock(Burger.class);

    @Test
    public void setBunsTest() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        Bun expectedBun = bun;
        Bun actualBun = burger.bun;

        assertEquals(expectedBun, actualBun);

    }
    @Before
    public void setUp(){
        burger.setBuns(bun);

    }
    @Test
    public void getBurgerPriceTest() {
        Burger burgerSpy = spy(Burger.class);
        doReturn(350f).when(burgerSpy).getPrice();
        float expectedPrice = 350f;

        assertEquals(0, Float.compare(expectedPrice, burgerSpy.getPrice()));
    }

    @Test
    public void getReceipt() {
    }
}