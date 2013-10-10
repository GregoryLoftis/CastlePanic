/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package castlepanic;

import processing.core.*;

/**
 *
 * @author jfenwic1
 */
public class Card {

    private String name;
    private PImage cardImage;

    //0 arg constructor
    public Card() {
    }

    //2 arg Constructor
    public Card(String s, PImage image) {
        name = s;
        cardImage = image;
    }

    //Name of Card
    public String name() {
        return null;

    }
}
