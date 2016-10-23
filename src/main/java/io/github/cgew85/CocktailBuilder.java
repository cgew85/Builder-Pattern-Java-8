package io.github.cgew85;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by cgew85 on 23.10.2016.
 */
public class CocktailBuilder {

    @FunctionalInterface
    public interface CocktailSetter extends Consumer<Cocktail> {
    }

    public static Cocktail build(CocktailSetter... cocktailSetters) {
        final Cocktail cocktail = new Cocktail();
        Stream.of(cocktailSetters).forEach(cocktailSetter -> cocktailSetter.accept(cocktail));
        return cocktail;
    }
}
