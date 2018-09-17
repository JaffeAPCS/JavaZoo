
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
    
    int delay = 4;
    
    try {
      for (int i=0; i<animalList.length; i++) {
        //Class<?> c = Class.forName(animalList[i]);
        //Animal a = (Animal)c.newInstance();
        Animal a = new RogerJaffe();
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
