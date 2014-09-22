

/**
 * Door (pair activity)
 * Davis Zhang
 * Eric Quasney
 */
public class Door
{
    /**  */
    private int state = 0;
    private String name = "";

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public Door(String name, int state)
    {
        this.name = name;
        this.state = state;
    }
        
    public void open()
    {
        this.state = 1;
    }
    public void close()
    {
        this.state = 0;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    public void setState(int newState)
    {
        this.state = newState;
    }

}
