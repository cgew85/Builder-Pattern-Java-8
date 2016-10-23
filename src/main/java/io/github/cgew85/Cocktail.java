package io.github.cgew85;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by cgew85 on 23.10.2016.
 */
@NoArgsConstructor
public class Cocktail {

    @Getter
    @Setter
    private String boozeNumberOne;

    @Getter
    @Setter
    private String boozeNumberTwo;

    private boolean hasCherry;

    private boolean hasLittleUmbrella;

    public boolean hasCherry() {
        return hasCherry;
    }

    public void setCherry(boolean hasCherry) {
        this.hasCherry = hasCherry;
    }

    public boolean hasLittleUmbrella() {
        return hasLittleUmbrella;
    }

    public void setLittleUmbrella(boolean hasLittleUmbrella) {
        this.hasLittleUmbrella = hasLittleUmbrella;
    }
}
