import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class FrogBog extends World
{
    GreenfootSound background = new GreenfootSound("music.mp3");
    GreenfootSound background1 = new GreenfootSound("ribbit.mp3");
    /**
     * Create the frog bog (a swamp area). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public FrogBog() 
    {
        super(560, 560, 1);
        background.playLoop();
        background1.playLoop();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Frog frog = new Frog();
        addObject(frog,215,504);
        Snake snake = new Snake();
        addObject(snake,47,518);
        Fly fly = new Fly();
        addObject(fly,51,91);
        Fly fly2 = new Fly();
        addObject(fly2,382,90);
        Fly fly3 = new Fly();
        addObject(fly3,200,160);
        Fly fly4 = new Fly();
        addObject(fly4,436,268);
        Fly fly5 = new Fly();
        addObject(fly5,233,289);
        Fly fly6 = new Fly();
        addObject(fly6,242,76);
        Fly fly7 = new Fly();
        addObject(fly7,61,226);
        Fly fly8 = new Fly();
        addObject(fly8,437,153);
        frog.setLocation(429,508);
    }
}