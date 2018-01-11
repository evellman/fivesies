
public class Task implements Priority,Comparable
{
    private double priority;
    private String task;
    
    public Task(double prior, String desc)
    {
        priority = prior;
        task = desc;
    }
    
    public String toString()
    {
        return (priority + "   " + task);
    }
    
    //Priority methods
    public double getPriority()
    {
        return priority;
    }
    
    public void setPriority(double new_priority)
    {
        this.priority = new_priority;
    }
    
    //Comparable method
    public int compareTo(Object o)
    {
        Task other = (Task) o;
        int result = (int) (this.priority - other.priority);
        return result;
    }
}