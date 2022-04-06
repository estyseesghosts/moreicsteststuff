// Chapter 5 - Methods - 5.1, 5.2
class OldMacDonald
{
  public static void main(String[] args)   {
    System.out.println("Old Macdonald had a farm");
    
    printChorus();  // method invokation or call
      
    System.out.println("And on that farm he had some cows");
    
    printChorus();
    printBridge("moo");
    
    
    System.out.println("Old Macdonald had a farm");
   
    printChorus();

    
    System.out.println("And on that farm he had some ducks");
    
    printChorus();
    printBridge("quack");
    
    System.out.println("Old Macdonald had a farm");
    printChorus();

    System.out.println("And on that farm he had some pigs");
    printChorus();
    printBridge("oink");
    
    System.out.println("Old Macdonald had a farm");
    printChorus();

  }
  
   /**
   * This will print the bridge of the old macdonald song
   * @param soundSolo the sound of the animal for the bridge
   */
  public static void printBridge(String soundSolo) // method header
  {
    System.out.println("With a " + soundSolo + "-" + soundSolo + " here");
    System.out.println("and a " + soundSolo + "-" + soundSolo + " there");
    System.out.println("Here a " + soundSolo);
    System.out.println("there a " + soundSolo);
    System.out.println("Everywhere a " + soundSolo + "-" + soundSolo);
  }
  
  /**
   * This will print the e-i-e-i-o part of the old macdonald song
   */
  public static void printChorus()   // method header
  {
       System.out.println("Ee");
       System.out.println("i");
       System.out.println("ee");
       System.out.println("i");
       System.out.println("ooooohhhh");
       

  }
  
  
  
}