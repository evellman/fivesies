
public class Task implements Priority,Comparable
{
    private double priority;
    private String task,notes = "none";
    
    public Task(double prior, String desc)
    {
        priority = prior;
        task = desc;
    }
    
    public Task(double prior, String desc, String note)
    {
        priority = prior;
        task = desc;
        notes = note;
    }
    
    public String getNotes()
    {
        return notes;
    }
    
    public void setNotes(String new_note)
    {
        notes = new_note;
    }
    
    public String toString()
    {
        return (priority + "   " + task + "   " + notes);
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