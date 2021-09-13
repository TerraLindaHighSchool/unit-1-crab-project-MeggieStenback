import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class FrogBog extends World
{
    GreenfootSound background = new GreenfootSound("music.mp3");
    GreenfootSound background1 = new GreenfootSound("ribbit.mp3");
    /**
     * Create the crab world (the beach). Our world has a size 
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
        Frog crab = new Frog();
        addObject(crab,250,243);
        Fly fly = new Fly();
        addObject(fly,410,304);
        Fly fly2 = new Fly();
        addObject(fly2,332,148);
        Fly fly3 = new Fly();
        addObject(fly3,183,405);
        Fly fly4 = new Fly();
        addObject(fly4,132,141);
        Fly fly5 = new Fly();
        addObject(fly5,325,31);
        Fly fly6 = new Fly();
        addObject(fly6,340,455);
        Fly fly7 = new Fly();
        addObject(fly7,109,330);
        Fly fly8 = new Fly();
        addObject(fly8,483,477);
        Snake snake = new Snake();
        addObject(snake,353,218);
    }
}