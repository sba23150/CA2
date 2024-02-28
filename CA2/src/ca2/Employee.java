/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2;

/**
 *
 * @author Tatiana Mota - sba23150
 * gitHub: https://github.com/sba23150/CA2.git
 */

/**(A)	Write the complete class, Employee, which has the following fields and methods:
Instance fields:
name, of type String
email, of type String
empNum, of type int
*/

public class Employee {
    //initialing the instance fields
    String name;
    String email;
    int empNum;
    
    //defining static field: nextEmpNum, of type int and initialized to 1, which initialises empNum in the constructor.  Its value must then be incremented to give consecutive numbers to each newly created object. 
    public static int nextEmpNum = 1;
    
    //initializing constructor 1 for default values:
    public Employee(){
        this.name = "Full Name ";
        this.email = "default@email.com";
        this.empNum = nextEmpNum;
        
        //increment nextEmpNum for the next object
        nextEmpNum++;
    }
    
    //constructor with values passed as parameters:
    public Employee (String name, String email){
        this.name = name;
        this.empNum = nextEmpNum;
        nextEmpNum++;
        
        //ensure email lenght is acceptable before setting it
        if (email.length()>3){
            this.email = email;
        } else {
            System.out.println("Email length must be greater than 3 characters. Email not updated.");
            this.email = "default@email.com";
        }
    }
    
    //METHODS:
    //Accessor methods to return name, email and empNum values.
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getEmpNum(){
        return empNum;
    }
    
    //setEmail(String email) – to set the email field to a new value passed as a parameter.  
    public void setEmail (String email){
        //The value must not be accepted if its length is 3 or less.
        if (email.length()>3){
            this.email = email;
        } else {
            System.out.println("Email length must be greater than 3 characters. Email not updated.");
        }
    }
    
    //getNextEmpNum() - to return the current value of nextEmpNum
    public static int getNextEmpNum() {
        return nextEmpNum;
    }    
}
