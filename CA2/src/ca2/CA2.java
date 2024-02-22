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

public class CA2 {
    //initialing the instance fields
    private String name;
    private String email;
    private empNum int;
    
    //initializing constructor 1 for default values:
    public CA2(){
        this.name = "Default";
        this.email = "Default";
        this.empNum = 0;
    }
    //constructor with values
    public CA2 (String name, String email, int empNum){
        this.name = name;
        this.email = email;
        this.empNum = empNum;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
