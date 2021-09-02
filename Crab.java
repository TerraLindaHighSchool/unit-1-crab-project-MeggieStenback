import greenfoot.*;

    /**
    * The class controls the Crab object
    * @author: Meggie Stenback
    * @version: 8/26/2021
    */
public class Crab extends Actor
{
     private int numOfWorms = 8;
    // This method repeats the following actions
    public void act()
    {
          
         move(3);
         turnAtEdge();
         checkKeyPress();
         onCollision();
     
    }

    // Moves the Crab

    // Turns the Crab at the edge
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
            turn(4);
        }
    
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        
                if(Greenfoot.isKeyDown("up"))
        {
            Greenfoot.delay(60);
        }
    }
    // Checks for collisions with other objects
    private void onCollision ( )
    {   
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
            numOfWorms --;
            // Winning the game
            if(numOfWorms ==0)

            {
             Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();   
            }
            if(getWorld( ).getObjects(Worm.class).size()==0)
            {
                
            }
        }
        if(isTouching(Lobster.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop( );
        }
    }
}
