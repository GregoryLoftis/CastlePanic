/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package castlepanic;

import processing.core.*;
import java.lang.*;

/**
 *
 * @author gloftis
 */
public abstract class Monster extends Token {

    private int hitPoints;
    protected int verticalLocation; //0 - Castle ring, 1 - Swordsman, 2 - Knight, 3 - Archer, 4 - Forest
    protected int horizontalLocation; // 1 through 6 going clockwise

    public Monster() {
        super();
    }

    public Monster(String name, int defaultHP, PImage graphic) {
        super(name, graphic);
        hitPoints = defaultHP;
        verticalLocation = 4;
        horizontalLocation = (int) Math.random()*6 + 1; //This is a random int between 1 and 6

    }

    public abstract void BirthEffects();

    public abstract void DeathEffects();

    public abstract void movement();
}
