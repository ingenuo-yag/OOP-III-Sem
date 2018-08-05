
package tables;
public class Tables {
  public static void main(String args[])
  {
      int n = Integer.parseInt(args[0]);
      System.out.println ("The Number You Have Enetered Is: ");
      for(int i=1;i<=10;i++)
      {
          System.out.println(i+"*"+n+"="+(i*n));
          
      }
      
  }
}
