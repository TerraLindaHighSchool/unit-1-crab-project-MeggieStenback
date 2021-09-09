import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LFly here.
 * 
 * @author Meggie Stenback 
 * @version (9/8/2021)
 */
public class Fly extends Actor
{
    /**
     * Act - do whatever the Fly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-1);
        turnAtEdge();
    }
    
    private void turnAtEdge( )
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
}
