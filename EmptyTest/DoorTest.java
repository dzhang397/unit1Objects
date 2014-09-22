

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class DoorTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class DoorTest
     */
    public DoorTest()
    {
        // initialise instance variables
        x = 0;
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
    public void constructorTest()
    {
        Door frontDoor = new Door("front", 0);
        assertequals(frontDoor.getName(), "front");
        assertequals(frontDoor.getState(), 0);
    }
    public void setStateTest()
    {
        Door frontDoor = new Door("front", 0);
        this.setState(0);
        assertequals(this.getState(), 0, 1e-6);
    }
    public void setNameTest()
    {
        Door frontDoor = new Door("front", 0);
        this.setName("New Name");
        assertequals(this.getName(), "New Name");
    }
    public void constructorTest2()
    {
        Door sideDoor = new Door("side", 0);
        assertequals(this.getName(), "front");
        assertequals(this.getState(), 0);
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

}
