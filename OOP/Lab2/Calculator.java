package calculator;
import java.util.Scanner;
public class Calculator 
{
    public static void main(String[] args) 
    {
        char op,next;
        float num1,num2,result=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------Welcome to Calculator-----------");
        do
        {
            System.out.println("Please Enter Operation");
            op = scan.next().charAt(0);
            System.out.println("Enter First Number: ");
            num1 = scan.nextFloat();
            System.out.println("Enter Second Number: ");
            num2 = scan.nextFloat();
            switch (op)
            {
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;
            }
            System.out.println("Result: "+result);
            System.out.println("Do You Want to perform another calculation(y/n): ");
            next = scan.next().charAt(0);
        }while(next == 'y');
    }
    
}
