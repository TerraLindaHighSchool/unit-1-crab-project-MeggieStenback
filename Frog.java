import greenfoot.*;

    /**
    * The class controls the Frog object
    * @author: Meggie Stenback
    * @version: 9/14/2021
    */
public class Frog extends Actor
{
    private int numOfFly = 8;
    
    // This method repeats the following actions
    public void act()
    {
         move(3);
         turnAtEdge();
         checkKeyPress();
         onCollision();
    }

    // Moves the Frog

    // Turns the Frog at the edge
    private void turnAtEdge( )
    {
        if(isAtEdge())
        {
            turn(-50);
        }
    }
    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress( )
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(2);
        }
    
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(2);
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(2);
        }
        
         if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(2);
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.delay(60);
        }
    }
    // Checks for collisions with other objects
    private void onCollision ( )
    {   
        if(isTouching(Fly.class))
        {
            removeTouching(Fly.class);
            Greenfoot.playSound("slurp.wav");
            numOfFly --;
            //Winning the game
            if(numOfFly ==0)

            {
            Greenfoot.setWorld(new WinSplash());
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();   
            }
            if(getWorld( ).getObjects(Fly.class).size()==0)
            {
                
            }
        }
        
        if(isTouching(Snake.class))
        {
            //Losing the game
            Greenfoot.setWorld(new LoseSplash());
            Greenfoot.playSound("splat.mp3");
            Greenfoot.stop( );
        }
    }
}
