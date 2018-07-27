/*
 * Created by: Ron Lawton
 * Last updated: 7/3/2017
 */
package factory;

public class Employee extends Person{
    /**
     * Inherits from the Person class, including access to private fields
     *   More could be added for Employee specific attributes and behaviors     
     */
    @Override
    public void action() {
        System.out.println("action method in Employee class"); 
    }
}
