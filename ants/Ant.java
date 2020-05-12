import greenfoot.*;

/**
 * An ant that collects food.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Ant extends Creature
{
    private boolean carryingFood = false;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private static final int MAX_PH_LEVEL = 18;
    private final int MAX_PH_AVAILABLE = 16;
    private final int TIME_FOLLOWING_TRAIL = 30;
    private int pHAvailable = MAX_PH_AVAILABLE;
    private int followTrailTimeRemaining = 0;
   /**
     * Create an ant with a given home hill. The initial speed is zero (not moving).
     */
    public Ant(AntHill home)
    {
        setHomeHill(home);
        image1 = getImage();
        image2 = new GreenfootImage("ant-with-food.gif");
    }
   /**
     * Do what an ant's gotta do.
     */
    public void act()
    {
        status();
    }
   private void checkForFood()
    {
        Food food = (Food) getOneIntersectingObject(Food.class);
        if (food != null) 
        {
            carryingFood = true;
            food.removeCrumb();
            setImage(image2);
        }
    }
   private boolean atHome()
    {
        if (getHomeHill() != null)
        { 
            return (Math.abs(getX() - getHomeHill().getX()) < 4) &&
                   (Math.abs(getY() - getHomeHill().getY()) < 4);
            
        }
        else
        {
            return false;
        }
    }
   private void searchForFood()
   {
       randomWalk();
       checkForFood();
   }
   private void status()
   {
       if (carryingFood == true)
       {
           walkTowardsHome();
           if(atHome())
           {
               setImage(image1);
               carryingFood = false;
               getHomeHill().countFood();
           }
       }
       else
       {
           searchForFood();
       }
   }
}

