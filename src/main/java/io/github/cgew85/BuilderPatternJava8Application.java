package io.github.cgew85;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderPatternJava8Application {

    public static void main(String[] args) {
        SpringApplication.run(BuilderPatternJava8Application.class, args);
        Cocktail whiteRussian = CocktailBuilder.build(
                c -> c.setBoozeNumberOne("Vodka"),
                c -> c.setBoozeNumberTwo("Kahlua"),
                c -> c.setCherry(false),
                c -> c.setLittleUmbrella(true)
        );
        System.out.println("Cocktail: " + whiteRussian.getBoozeNumberOne() + " and "
                + whiteRussian.getBoozeNumberTwo());
    }
}
