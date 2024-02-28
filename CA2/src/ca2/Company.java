/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
    
    //Part 2 c)	Create a Netbean-console menu system for the manager to log in and view current staff and add new staff. (username – “Gnomeo”; Password – “smurf”)
    
    public void main(String[] args) {
        // Create a manager with predefined username and password
        Manager manager = new Manager("Manager Name", 123, "Gnomeo", "smurf");

        // Create a Company instance
        Company company = new Company("Company Name");

        // Console input scanner
        Scanner scanner = new Scanner(System.in);

        // Login loop
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("Enter username:");
            String usernameInput = scanner.nextLine();
            System.out.println("Enter password:");
            String passwordInput = scanner.nextLine();

            // Check if the entered username and password match the manager's credentials
            if (usernameInput.equals(manager.getUsername()) && passwordInput.equals(manager.getPassword())) {
                System.out.println("Login successful!");
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        // Menu loop
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. View current staff");
            System.out.println("2. Add new staff");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Current Staff:");
                    // Call the listEmployees method to display current staff
                    company.listEmployees(0); // You can pass any value as parameter for this example
                    break;
                case 2:
                    // Add new staff
                    System.out.println("Enter employee name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter employee email:");
                    String email = scanner.nextLine();
                    scanner.nextLine(); 

                    // Create a new employee and add it to the company
                    Employee newEmployee = new Employee(name, email);
                    company.addNewStaff(newEmployee);
                    System.out.println("New staff added successfully!");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 3.");
            }
        }

        // Close scanner
        scanner.close();
    }
}
