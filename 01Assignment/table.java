//3.Take a number as input and print the multiplication table for it.
import java.util.Scanner;
class table{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number for table:");
    int a=sc.nextInt();
    for(int i=1;i<=10;i++)
    {
      System.out.println(a+"x"+i+"="+a*i);
    }

  }
}