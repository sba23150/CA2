/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;
/**
 *
 * @author Tatiana Mota - sba23150
 * gitHub: https://github.com/sba23150/CA2.git
 */

/*
(B)	Write another class, EmployeeTest, containing the main method, which

Creates 3 Employee objects, with the following details

Name	Email
Joe Bloggs	jb@gmail.com 
Ann Banana	ab@gmail.com
Tom Thumb	tt@gmail.com
*/

public class EmployeeTest {
    
    public static void main(String[] args) {
        // Creating 3 Employee objects
        Employee emp1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee emp2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee emp3 = new Employee("Tom Thumb", "tt@gmail.com");

        // Declares an array, called projectGroup, to store these 3 Employee objects and loads the array with the objects.
        Employee[] projectGroup = new Employee[3];

        projectGroup[0] = emp1;
        projectGroup[1] = emp2;
        projectGroup[2] = emp3;

        // Prints out the value of variable nextEmpNum to the terminal window. 
        System.out.println("Value of variable nextEmpNum: " + Employee.nextEmpNum);
        
        
        //(C)	Write the code to search and display the name of each of the employees in the projectGroup array, who have an employee number above the value stored in a variable called m.
        // Declaring m
        int m = 2; // Example value

        // Displaying names of employees with empNum > m
        System.out.println("Employees with employee number greater than " + m + ":");
        for (Employee emp : projectGroup) {
            if (emp.getEmpNum() > m) {
                System.out.println(emp.getName());
            }
        }
    }
    
}
