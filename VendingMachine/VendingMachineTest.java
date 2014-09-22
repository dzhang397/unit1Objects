

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testCustomConstructor()
    {
        VendingMachine machine = new VendingMachine(33);
        int inventory = machine.inventory;
        assertEquals(33, inventory);
    }
    
    @Test
    public void testInsertToken()
    {
        VendingMachine machine = new VendingMachine();
        machine.insertToken(23);
        int tokens = machine.tokens;
        assertEquals(23, tokens);
    }
    
    @Test
    public void testfillUp()
    {
        VendingMachine machine = new VendingMachine();
        machine.fillUp(23);
        int inventory = machine.inventory;
        assertEquals(33, inventory);
    }
    
    @Test
    public void testgetCanCount()
    {
        VendingMachine machine = new VendingMachine();
        int CanCount = machine.getCanCount();
        assertEquals(CanCount, 10);
    }
    
    @Test
    public void testgetTokenCount()
    {
        VendingMachine machine = new VendingMachine();
        int TokenCount = machine.getTokenCount();
        assertEquals(TokenCount, 0);
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
