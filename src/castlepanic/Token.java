/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package castlepanic;
import processing.core.*;

/**
 *
 * @author gloftis
 */
public class Token {
    private String tokenName;
    private PImage tokenImage;
    
    public Token() {
        tokenName = null;
        tokenImage = null;
    }
    
    public Token(String name, PImage image) {
        tokenName = name;
        tokenImage = image;       
    }
    
    
}
