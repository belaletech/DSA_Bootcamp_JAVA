import java.util.Scanner;
public class GCD { 
  static int gcd(int a,int b)
  {
    if(a==0)
    {
      System.out.println(" HCF Of Two number is "+ b);
      return b;
    }
    if(b==0)
    {
      System.out.println("Hcf of two number is " +a);
      return a;
    }
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
        return i;
      }
      
    }
    return 1;
  }

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your first number ");
    int a=sc.nextInt();
    System.out.println("Enter your second number");
    int b=sc.nextInt();
    System.out.println("HCF/GCD Of Two number = "+gcd(a,b));
    int lcm= (a*b)/gcd(a,b);
    System.out.println("LCM of Two Numner:"+lcm);
  }
  
}
