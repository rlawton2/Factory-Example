/*
 * Created by: Ron Lawton
 * Last updated: 7/3/2017
 */
package factory;
/**
 * This class will serve as the reference type of any objects we create. 
 * Attributes and behaviors common to Clients and Employees are in this class.
 */
public class Person {

    private String FName;
    private String LName;
    
    // Set method for both FName and LName
    public void setFullName(String first, String last) {
        this.FName = first;
        this.LName = last;
    }
    // FName get and set methods
    public String getFname() {
        return FName;
    }
    public void setFname(String Fname) {
        this.FName = Fname;
    }
    // LName get and set methods
    public String getLname() {
        return LName;
    }
    public void setLname(String Lname) {
        this.LName = Lname;
    }
    // Method to return the type of object
    public String getType() {
        return this.getClass().getSimpleName();
    }
    public void action() {
        
    }
    @Override
    public String toString() {
        return getType() + ": " + FName + " " + LName;
    }
}
