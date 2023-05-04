//1.Input a year and find whether it is a leap year or not.
import java.util.Scanner;
class LeepYear
{
  public static void main(String[] args)

  {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter Year for find whether it is a leap year or not ");
    int year=obj.nextInt();
    if((year%4==0 )||( year%400==0 && year%100!=0))
    {
      System.out.println("leep year");
    }
    else
    {
      System.out.println("not leep year");
    }
  }
}