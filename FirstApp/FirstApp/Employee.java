package FirstApp;
import java.util.Scanner;

public class Employee {
    
/*1.Better to keep data private for data hiding
2.Always initialze data  */ 
private static int internsalary = 8000; //static fields 
private String position = "Intern Engineer";
private double pay = 50000;
private String name =" ";
private int age = 0;


//No Arg Consructor 
public Employee()
{
   
}

//Constructor 
public Employee(String name, int age, String position, double pay)
{
   
   setPay(pay);
   setPosition(position);
   setName(name);
   setAge(age);
   
   //Ask about retirement 
   Scanner input = new Scanner(System.in);
   System.out.println("Would you like to contribute money to retirement? ");
   String answer = input.nextLine();
   


   /*
   //you can't compare string using the if statement if(variablename == "String")
   if(answer.equals("yes"))
   {  RetirementSolver(pay);}
   else {return;}
   */
}

//Set the employee age 
public void setAge(int age)
{
   this.age = age;
}

//Returns final annual salary pre-taxed after retirement reduction
public final double setFinalPay(double result)
{
   return result;
}

//Return the employee age 
public int getAge()
{
   return this.age;
}

//Set the employee name 
public void setName(String name)
{
   this.name = name;
}

//Return the employee name 
public String getName()
{
   return this.name;
}

//Set the employee pay/salary
public void setPay(double pay)
{
   this.pay = pay;
}
   
//Return the employee pay/salary
public double getPay()
{
   return this.pay;
}

//Set the employee job position 
public void setPosition(String position)
{
   this.position = position;
}

//Return the employee job position 
public String getPosition()
{
   return this.position;
}



/*
//Create an object retirement() that saves the amount of money user 
//would like to hold in retirement 
public void RetirementSolver(double pay)
{
   
   Retirement r = new Retirement(pay);

}
*/





}