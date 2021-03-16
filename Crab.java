import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
   {
        turnAtEdge();
        lookingForWorm();
        randomTurn();
        move(5);
    }
     
    /*
     * the crabs eat the worms using this code
     */
    public  void lookingForWorm()
    {
        if (isTouching(Worm.class))
        {
            removeTouching(Worm.class);
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

