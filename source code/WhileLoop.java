// Java while Loop Example
// Following is a while loop that counts down from 10, printing exactly 10 lines of "tick" :

/* Java Program Example - Java while Loop
 * Demonstrate the while Loop */

public class WhileLoop
{   
    public static void main(String args[])
    {
        
        int n = 10;
        
        while(n>0)
        {
            System.out.println("tick " + n);
            n--;		// need to give increasement or decreasement based on logic
        }
        
    }
}