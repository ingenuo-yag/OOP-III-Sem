package factorial;
public class Factorial {
    public static void main(String args[]) 
    {
        int num,fact=1;
        int i=1;
        num = Integer.parseInt(args[0]);
        System.out.println("The Number You Have Enetered Is: "+num);
        while(i<num)
        {
            fact = fact*i;
            i++;
        }
        System.out.println("The Factorial of the number is: "+fact);
    }
    
}
