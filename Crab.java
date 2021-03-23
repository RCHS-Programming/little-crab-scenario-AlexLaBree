import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    
    public Crab()
    {
        image1=new GreenfootImage ("crab.png");
        image2=new GreenfootImage ("crab2.png");
    }
    // methods ommitted
    public void act()
   {
          if (Greenfoot.isKeyDown("left"))
        {
            turn (-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn (4);
        }    
        lookingForWorm();
      
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
            Greenfoot.playSound ("slurp.wav");
        }
   }
   
   public void checkKeyPress()
   { 
     if (Greenfoot.isKeyDown("left"))
     {
         turn (-4);
     }
     
     if (Greenfoot.isKeyDown("right"))
        {
            turn (4);
        }       
    }  
}     
  
  

   


    
        
        
    
   

