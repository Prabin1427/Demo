import java.util.Date;

/**
 * A class to explain classes and instances and how a Java program looks like.
 *
 * @author Ingo Frommholz
 * @version March 2020
 */
public class Human
{
    String name;
    Date dateOfBirth; // Date is imported from java.uitl. See the import statemnt above.
    
    /**
     * Set the name of the human being.
     * 
     * @param personName the name
     */
    public void setName(String personName) {
        name = personName;
    }
    
    /**
     * Get the name of the human being.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * The main method.
     */
    public static void main(String[] args) {
        // Our first human being
        Human ingo = new Human();
        ingo.setName("Ingo");
        System.out.println("We just created a new human and his name is " +
            ingo.getName() + ".");
        
        // Our 2nd humanm being
        Human sue = new Human();
        sue.setName("Sue");
        System.out.println("We just created a new human and her name is " +
            sue.getName() + ". She teaches Java together with " 
            + ingo.getName() + ".");
    }
}
