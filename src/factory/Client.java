/*
 * Created by: Ron Lawton
 * Last updated: 7/3/2017
 */
package factory;

public class Client extends Person{
    /**
     * Inherits from the Person class, including access to private fields
     *   More could be added for Client specific attributes and behaviors
     * 
     */ 
    static int numTracker = 1000;     // value just for reference purposes
    int clientNum;
    
    // Static count added in constructor
    public Client(){
        clientNum = numTracker;
        numTracker++;
    }
    
    @Override
    public void action() {
        System.out.println("action method in Client class"); 
    }
    
    // returns the clientNum value
    public int getClientNum() {
        if (this instanceof Client)
            return clientNum;
        else
            return 0000;
    }
}
