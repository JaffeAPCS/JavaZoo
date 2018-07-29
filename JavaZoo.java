
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
    
    try {
      for (int i=0; i<animalList.length; i++) {
        Animal a = new RogerJaffe();
        System.out.println("Animal #"+(i+1)+" by "+a.getClassName());
        System.out.println(a.toString());
        System.out.println();
      }
    } catch (Exception e) {
      System.out.println("Someone messed up!");
    }
  }
}
