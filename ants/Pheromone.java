import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pheromone here.
 * 
 * @author Tyler Ford
 * @version 5/17/20
 */
public class Pheromone extends Actor
{
    private GreenfootImage image;
    private final int MAX_INTENSITY = 180;
    private int intensity;
    /**
     * Act - do whatever the Pheromone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        intensity--;
        if(intensity <= 0)
        {
            
        }
        else
        {
            if ((intensity % 6) == 0)
            {
                updateImage();
            }
        }   
    }
    
    private void updateImage()
    {
        int size = intensity / 3 + 5;
        image = new GreenfootImage(size + 1, size + 1);
        image.setColor(new Color(225, 225, 225, intensity / 3));
        image.fillOval(0, 0, size, size);
        image.setColor(Color.GRAY);
        image.fillRect(size/2, size/2, 2, 2);
        setImage(image);
    }
}

