package FirstApp;  /*Allows access to all classes in the package 
To access a class in a different package, you import the package or
import the package and inclde the class name*/
import java.util.ArrayList;
import java.util.Scanner;
 

 /**Study Chapter 4.5: Method Parameters */



/**
 * GOAL OF THE PROGRAM IS TO ALLOW USER TO ENTER EMPLOYEE INFORMATION
 * AND DISPLAY MONTHLY SALARY AFTER TAXES. 
 * USER WILL BE GIEN THE OPTION TO TAKE OUT MONEY FOR RETIREMENT AND 
 * DISPLAY THAT AS WELL
 */

public class helloworld {
    
public static void main(final String[] args) {

//User Input 
Scanner input = new Scanner(System.in);

/*
If you created two different objects, they are not accessible to each other 
The "new Employee()" term constructs our object"
The variables that we use to construct the objects are references 
to the objects
*/

//Ask the user how many employee he would like to create 
System.out.println("How many employees would you like to add?");
int arraysize = input.nextInt(); //ArrayList capacity created 
input.nextLine(); //clear to the next line after integer input 

//Create an arraylist for Employee class. It will reference the Employee object 
ArrayList<Employee> employees = new ArrayList<>(arraysize);

int counter = 0;
while(counter < arraysize)
{

 //Create and initialize fields for a typical employee
System.out.println("Enter your name: ");
String name = input.nextLine();

System.out.println("Enter your age: ");
int age = input.nextInt();
input.nextLine();

System.out.println("Enter your job position");
String jobposition = input.nextLine();

System.out.println("Enter your salary: ");
double salary = input.nextDouble();
input.nextLine();

employees.add(new Employee(name, age, jobposition, salary));

counter++;
}

//Display Employee Information 
for(int i=0;i<employees.size();i++)
{


//Tips: Type in "sysout and tab or enter to get the println() function"
System.out.println();
System.out.println("Name: " + employees.get(i).getName());
System.out.println("Age: " + employees.get(i).getAge());
System.out.println("Job Position: " + employees.get(i).getPosition());
System.out.println("Salary: " + employees.get(i).getPay());
System.out.println("Retirement Contributions: ") ;

}
//Array Size 
System.out.println("Array Size is " + employees.size());

}

/** Create lambda expressions connected to an interface that focuses on 
 * diplaying error detection methods 
 */

/**
 * Create error exceptions for invalid inputs 
 */



}