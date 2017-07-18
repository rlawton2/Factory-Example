/**
 * Created by: Ron Lawton
 * Last updated: 7/3/2017
 * 
 * This program was created after studying some of the design patterns commonly
 * used in software development.
 * The program is a factory program which creates object types at runtime. This 
 * design is helpful when the object type is not known prior to runtime
 */
package factory;

public class FactoryDemo {

    public static void main(String[] args) {
        PersonCreator creator = new PersonCreator();
        
        /* These object types are known at runtime, but consider if you had a UI
           where the user would select what type of object to create
        */
        Person person1 = creator.getPerson("Client");
        person1.setFullName("Bill", "Smith");
        Person person2 = creator.getPerson("Client");
        person2.setFullName("Sally", "Jones");
        Person person3 = creator.getPerson("Employee");
        person3.setFullName("Tammy", "Bellows");
        Person person4 = creator.getPerson("Client");
        person4.setFullName("Fred", "Billings");
        
        // Just some output to verify results
        System.out.println(person3.toString());
        // or (same output style different object)
        System.out.println(person2.getType() + ": " + person2.getFname() + " " +
                person2.getLname());
        
        // Access Client attributes and behavior by downcasting the object 
        // reference type
         System.out.println(person4.toString() + "\nCustomer Number: " +
                 ((Client)person4).getClientNum());
         
         // Could also change the reference type after the object has been
         // created.  
         Client client1 = person4 instanceof Client ? (Client)person4 : null;
    }
}
