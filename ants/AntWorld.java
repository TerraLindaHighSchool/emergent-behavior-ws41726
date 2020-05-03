import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * The world where ants live.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class AntWorld extends World
{
    public static final int SIZE = 640;

    /**
     * Create a new world. It will be initialised with a few ant hills
     * and food sources
     */
    public AntWorld()
    {
        super(SIZE, SIZE, 1);
        setPaintOrder(Ant.class, AntHill.class);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        AntHill antHill = new AntHill();
        addObject(antHill,161,225);
        AntHill antHill2 = new AntHill();
        addObject(antHill2,462,544);
        Food food = new Food();
        addObject(food,385,202);
        Food food2 = new Food();
        addObject(food2,339,358);
        Food food3 = new Food();
        addObject(food3,156,403);
        Food food4 = new Food();
        addObject(food4,339,487);
        Food food5 = new Food();
        addObject(food5,465,343);
        Food food6 = new Food();
        addObject(food6,239,36);
        Food food7 = new Food();
        addObject(food7,275,265);
        Food food8 = new Food();
        addObject(food8,581,491);
        Food food9 = new Food();
        addObject(food9,155,549);
        Food food10 = new Food();
        addObject(food10,491,106);
        Food food11 = new Food();
        addObject(food11,551,244);
        Food food12 = new Food();
        addObject(food12,68,104);
        Food food13 = new Food();
        addObject(food13,58,362);
    }
}
