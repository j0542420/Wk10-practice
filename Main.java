public class Main 
{
    // method to calculate factorial
    static long factorial(int n) 
    {
      if (n==1)
      {
        return 1;
      }
      else
      {
        return n*factorial(n-1);
      }
    }
    // normal method
    static long fac(int n)
    {
        int product=1;
        for (int i=1; i<=n; i++)
        {
            product *= i;
        }
        return product;
    }
    // Main code
    public static void main(String[] args) 
    {
        long result = factorial(3);
        System.out.println(result);
    }
  }