import java.util.*;
/**
 * This class will comprise methods from the 
 * sample quiz for arrays and methods.
 * @author C Cardoso
 * Date last modified April 6th, 2022
 */
class SampleQuizArraysMethods
{
  /**
   * This method will take an integer n and return
   * an array with all the factors of n.
   * @param the integer we want to find the factors of
   * @return the array containing all factors of n
   */  
  public static int[] findFactors(int n)
  {
    int[] factors = new int[numOfFactors(n)];
    
    for(int i = 1, pos = 0; i <= n; i++)
    {
      if(n % i == 0)
      {
        factors[pos] = i;
        pos++;
      }
    }
    return factors;
  }
  
  /**
   * This method will take an int and return the
   * number of factors that that int has.
   * For example, if n is 8, this method will return
   * 4 since 8 has 4 factors (1, 2, 4, 8).
   * @param n the integer
   * @return the number of factors of n
   */
  public static int numOfFactors(int n)
  {
    int numOfFactors = 2; // already have 2 factors, 1 and itself
    
    for(int i = 2; i <= n/2; i++)
    {
      if(n % i == 0)
        numOfFactors++;
    }
    
    return numOfFactors;
  }
  
  
  public static void main(String[] args)
  {
    
    System.out.println("*****Test Case 1 ************");
    System.out.println("Testing findFactors(8)");
    System.out.println("Expected result: {1, 2, 4, 8}");
    System.out.println("Program result: " + Arrays.toString(findFactors(8)));
    
    System.out.println("*****Test Case 2 ************");
    System.out.println("Testing findFactors(12)");
    System.out.println("Expected result: {1, 2, 3, 4, 6, 12}");
    System.out.println("Program result: " + Arrays.toString(findFactors(12)));
    

  }
}