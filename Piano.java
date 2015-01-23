import greenfoot.*;
import java.awt.Color;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * Write a description of class Piano here.
 * 
 * @author Sebastiaan Kappert
 * @version (a version number or a date)
 */
public class Piano extends World
{ 
           private String[] whiteKeys =
           { "A", "S", "D", "F", "G", "H", "J", "K", "L", ",", ".", "/" };
           private  String[] whiteNotes =
           { "3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g" };
        
           private String[] blackKeys =
           { "q", "w", "", "e", "r", "t", "", "y", "u", "", "i" }; 
           private String[] blackNotes =
           { "3g#", "3a#", "4c#", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#" }; 
        
    public Piano() 
    {
        super(800, 340, 1);
        makeKeys();
    }
    
    private void makeKeys() 
     {
        // Voor de witte note
        for(int i = 0; i < whiteKeys.length; i++) {
            Key key = new Key(whiteKeys[i], whiteNotes[i]+".wav", "white-key.png", "white-key-down.png"); 
            addObject(key, 54 + (i*63), 140);
        }
        // Voor de zwarte noten
        for(int i = 0; i < whiteKeys.length-1; i++) {
            if( ! blackKeys[i].equals("") ) {
                Key key = new Key(blackKeys[i], blackNotes[i]+".wav", "black-key.png", "black-key-down.png");
                addObject(key, 85 + (i*63), 86);
            }
        }
    }
}