/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Tatiana Mota - sba23150
 * gitHub: https://github.com/sba23150/CA2.git
 */

/**Part 2 
Company class stores information about employees.
*/

public class Company {
    //initializing the field companyName for the name of the company
    private String companyName;
    //initializing an ArrayList, called staff, to hold a list of employee objects, whose class is described in Question 1 above
    private ArrayList<Employee> staff;
    
    //Write the default constructor for this class which initialises all fields.
    public Company(){
        companyName = "Business Gnómes Ltd";
        staff = new ArrayList<>();
    }
    
    //Write an overloaded constructor which accepts a name value as a parameter
    public Company (String companyName){
        this.companyName = companyName;
        staff = new ArrayList<>();        
    }    
    // Method addNewStaff() that adds a new employee to the staff arrayList (the employee is a parameter). 
    public void addNewStaff(Employee employee) {
        staff.add(employee);
    }

    // Method getStaffNumber() that returns the number of employees currently in the arrayList.
    public int getStaffNumber() {
        return staff.size();
    }

    // Method listEmployees() that uses an iterator object to find in the arrayList all employees above a given employee number value  (this value is a parameter for this method) and prints the names of these employees.
    public void listEmployees(int employeeNumber) {
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpNum() > employeeNumber) {
                System.out.println(employee.getName());
            }
        }
    }    
    
    //A particular employee has been designated a “manager”. They are considered as a regular employee for all purposes, except that they also have a “username” and a “password” as fields, with corresponding getters and setters. 
    class Manager extends Employee {
        private String username;
        private String password;

        // Constructor
        public Manager(String name, int empNum, String username, String password) {
            this.name = name;
            this.empNum = empNum;
            this.username = username;
            this.password = password;
        }

        // Getters and setters for username and password
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
