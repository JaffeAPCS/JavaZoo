
/**
 * Write a description of class JavaZoo here.
 * 
 * @author Mr. Jaffe
 * @version 2017-07-014
 */
public class JavaZoo
{
  
  public static void main(String[] args) {
    
    // Change BoopleSnoot to the name of your animal class and run the 'main' 
    // method to test your class.  You can also test your class using BlueJ
    String[] animalList = {"RogerJaffe"};
    
    int delay = 5;
    
    try {
      for (int i=0; i<animalList.length; i++) {
        // Change the name to the name of your class to test
        Animal a = new RogerJaffe();
        
        // These lines will be used to run the program with all the student classes
        //Class<?> c = Class.forName(animalList[i]);
        //Animal a = (Animal)c.newInstance();
        
        System.out.println("Animal #"+(i+1)+" by "+a.getClassName());
        System.out.println(a.toString());
        System.out.println();
        TimeUnit.SECONDS.sleep(delay);
      }
    } catch (Exception e) {
      System.out.println("Someone messed up!");
      System.out.println(e.getMessage());
    }
  }
}
