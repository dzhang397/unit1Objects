

/**
 * VendingMachine Solo Lab
 * 
 * @Davis Zhang
 * @9.17.14
 */
public class VendingMachine
{
    /* Number of cans in inventory*/
    public int inventory;
    
    /* Number of tokens inserted*/
    public int tokens;
    
    /*Adds cans to the inventory */
    public void fillUp(int cans)
    {
        this.inventory = this.inventory + cans;
    }
    
    /*adds tokens to machine*/
    public void insertToken(int newTokens)
    {
        this.tokens = this.tokens + newTokens;
    }
    
    /*returns cans in inventory*/
    public int getCanCount()
    {
        return this.inventory;
    }
    
    /* returns tokens in machine*/
    public int getTokenCount()
    {
        return this.tokens;
    }
    
    /* Default constructor for objects of class a*/
    public VendingMachine()
    {
        // initialise instance variables
        this.inventory = 10;
        this.tokens = 0;
    }
    
    public VendingMachine(int initialCans)
    {
        this.inventory = initialCans;
        this.tokens = 0;
    }


}
