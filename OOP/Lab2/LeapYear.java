package leapyear;
import java.util.Scanner;
public class LeapYear 
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        int year;
        System.out.println("Enter Year: ");
        year = scan.nextInt();
        System.out.println("Year you entered is: "+year);
        if(year%4 != 0)
        {
            System.out.println("Not a leap year");
        }
        else if(year%100 != 0)
        {
             System.out.println("It is a leap year");
        }
        else if(year%400 != 0)
        {
             System.out.println("It is not a leap year");
        }
        else
        {
            System.out.println("It is a leap year");
        }
        
    }
    
}
