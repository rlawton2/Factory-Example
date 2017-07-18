/*
 * Created by: Ron Lawton
 * Last updated: 7/3/2017
 */
package factory;

/**
 *  This is the main portion of the program. This class will determine what 
 *  object type will be created.
 * 
 */
public class PersonCreator {
    public Person getPerson(String type) {
        if (type == null){
            return null;
        }
        if(type.equalsIgnoreCase("Client")) {
            return new Client();
        }
        if(type.equalsIgnoreCase("Employee")) {
            return new Employee();
        }
        return null;
    }
}
