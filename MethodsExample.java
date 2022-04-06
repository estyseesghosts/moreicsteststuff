class MethodsExample
{
   public static void main(String[] args)
   {
      //int a = 3;
      //int b = 7;
           
      //int bigger = max(a, b);
      //System.out.println("The bigger number is " + bigger);
      
      int[] ar = {3, 7};
      
      System.out.println("Before swap : " + ar[0] + "\t" + ": " + ar[1]);
      swap(ar);
      System.out.println("After swap : " + ar[0] + "\t" + ": " + ar[1]);
   }
   
   public static void swap(int[] a)
   {
      int temp = a[0];
      a[0] = a[1];
      a[1] = temp;
      //System.out.println("Before swap x: " + x + "\t" + "y: " + y);
   }
   
   public static int abs(int a)
   {
     if(a < 0)
       return a*-1;
     else
       return a;
     
   }
   
   public static int abs(double a)
   {
     if(a < 0)
       return a*-1;
     else
       return a;
     
   }
   
   public static int max(int a, int b)
   {
     
   }
   
   public static double max(int a, int b)
   {
     
   }

  
  
   public static void swap(int x, int y)
   {
      int temp = x;
      x = y;
      y = temp;
      System.out.println("Before swap x: " + x + "\t" + "y: " + y);
   }
   
   public static int max(int x, int y)
   {
      if(x > y)
         return x;
      else
         return y;
   }

}