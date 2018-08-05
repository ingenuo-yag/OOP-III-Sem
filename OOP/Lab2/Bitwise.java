package bitwise;
import java.util.Scanner;
public class Bitwise {
public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num,mult,div;
        System.out.println("Enter a Number: ");
        num = scan.nextInt();
        mult = num<<1;
        System.out.println("Multiplication: "+mult);
        div = num>>1;
        System.out.println("Division: "+div);
        
    }
    
}
