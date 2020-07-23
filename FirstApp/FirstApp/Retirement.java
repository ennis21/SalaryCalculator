package FirstApp;
import java.util.Scanner;

//This is a subclass(child) that extends to a parent class
public class Retirement extends Employee {
private double stockoptions = 0;
private double retirement; 
double salary = 0;

//Understand how the super keyword could be used here
public Retirement(double salary)
{
   System.out.println("Calculating Retirement......");
   calculateRetirement(salary);
}

/**Note:
 * As of 2020 the limit for 401(k) contribution is 19,500
 * and 26,000 for ages 50 and above.
 * You can contribute 6,000 to traditional IRA(Pre-Tax) to your
 * traditional IRA(Pre-Tax) and Roth IRA(After-Tax)
 */

//Calculate amount employee will contribute to retirement 
public void calculateRetirement(double salary)
{
    Scanner input = new Scanner(System.in);

    
    //Set Retirement Amount 
    System.out.println("Note: the retirement amount includes contributing to 401k, " +
    "Traditional IRA, and Roth IRA");
    System.out.println("Enter the retirement amount: ");
    double retire = input.nextDouble();
    input.nextLine();

    //Verify if retire amount exceeds salary  
    boolean verify = checkAmount(retire, salary);

    /**If the retirement amount does not exceed salary, set it
     * Else enter a different amount 
     */
    /**FIX THIS  */
    if(verify == true)
    {
    System.out.println("Retire amount is acceptable");
    retire = salary - retire;
    setRetirement(retirement);
    }
    else{System.out.println("Input exceeds salary amount, Enter a new amount: ");}

    
   
}


//Check if amount exceeds salary 
public boolean checkAmount(double retireAmount, double salary)
{
    //Check if amount exceeds salary amount 
    if(retireAmount < salary)
    {  return true;   }

    else{return false;}
}


//Set the amount employee saving for retirement 
public void setRetirement(double retirement)
{
   this.retirement = retirement;   
}

//Return the amount put towards employee retirement 
public double getRetirement()
{
    return this.retirement;
}

}

