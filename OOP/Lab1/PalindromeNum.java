/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromenum;
public class PalindromeNum 
{
    public static void main(String args[])
    {
        int n;
        n = Integer.parseInt(args[0]);
        int num=n;
        int a=0,k;
        while(n>0)
        {
            k=n%10;
            a=a*10+k;
            n/=10;
        }
        if(num==a)
        {
        System.out.println("Number is a palindrome");
        }
        else
        {
            System.out.println("Number is not a palindrome");
   
        }   
    }

 }
