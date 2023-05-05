//4.Take 2 numbers as inputs and find their HCF and LCM
import java.util.Scanner;
class HCF{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your first number");
    int a=sc.nextInt();
    System.out.println("Enter your second number");
    int b=sc.nextInt();
    //int product=a*b;
    //sc.close();
    int min=0;
    if(a<b)
    {
      min=a;
    }
    else
    {
      min=b;
    }
    for(int i=min;i>=1;i--)
    {
      if(a%i==0 && b%i==0)
      {
        System.out.println("HCF of two number is : "+i);
        break;
      }
      
    }
      
  }
  
}