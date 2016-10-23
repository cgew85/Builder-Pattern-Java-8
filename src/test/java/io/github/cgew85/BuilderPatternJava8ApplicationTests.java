package io.github.cgew85;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuilderPatternJava8ApplicationTests {

    @Test
    public void testBuilder() {
        Cocktail whiteRussian = CocktailBuilder.build(
                c -> c.setBoozeNumberOne("Vodka"),
                c -> c.setBoozeNumberTwo("Kahlua"),
                c -> c.setCherry(false),
                c -> c.setLittleUmbrella(true)
        );

        assertEquals(whiteRussian.getBoozeNumberOne(), "Vodka");
        assertEquals(whiteRussian.getBoozeNumberTwo(), "Kahlua");
        assertEquals(whiteRussian.hasCherry(), false);
        assertEquals(whiteRussian.hasLittleUmbrella(), true);
    }
}
