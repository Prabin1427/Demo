/**
 * String object and concatenation demo
 * @author Ingo Frommholz
 * 13.10.2011
 */
public class MyName
{
    public static void main(String str[])
    {
        String firstName = new String("Ingo");
    
        // this is the same as 
        // String secondName = new String("Frommholz");
        String secondName = "Frommholz";
        String space = " ";
        
        System.out.println(firstName + space + secondName);
    }
        
}