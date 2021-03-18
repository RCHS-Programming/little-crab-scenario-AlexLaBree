import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        turnAtEdge();
        randomTurn();
        move(5);
        lookingForCrab();
    } 
    
    /*
     * the crabs eat the worms using this code
     */
    public  void lookingForCrab()
    {
        if (isTouching(Crab.class))
        {
            removeTouching(Crab.class);
            Greenfoot.playSound ("au.wav");
            Greenfoot.stop();
        }
    }

   /*
    * Make the crab randomly turn left or right between 0-45 degrees
    */
   public void randomTurn()
   {
       if(Greenfoot.getRandomNumber(100)<10)
       {
           turn( Greenfoot.getRandomNumber(91)-45);

       }
    }

    public void turnAtEdge()
    {
        if ( isAtEdge() )
        {
            turn(17);
          
        }
    }
}
