
/**
 * Abstract class Animal
 * 
 * @author Mr. Jaffe
 * @version 1.1 2018-07-29
 */
public abstract class Animal
{
  /**
   * This will return the type of animal (i.e. "Dog", "Cat", etc)
   * 
   * @return The type of the animal
   */
  public String getType() {
    return "*** Abstract animal ***";
  }
  
  /**
   * Getter for color
   */
  public String getColor() {
    return "*** Abstract color ***";
  }
  
  /**
   * Getter for legs
   */
  public int getLegs() {
    return 0;
  }
  
  /**
   * What does the animal say?  Descendant classes should override this
   * method or default speak will generate "Yaba-daba-doo"
   */
  public String speak() {
    return "*** Yaba-daba-doo [default] ***";
  }
  
  /**
   * This will return a String that describes the animal's general disposition.
   * Sample dispositions could be "mean" or "friendly".  Use different adjectives
   * in your method. The default disposition is "meh"
   * 
   * @return Disposition
   */
  public String getDisposition() {
    return "*** meh [default] ***";
  }
    
  /**
   * This will return the animal's name. What's the default name?
   * 
   * @return The name of the animal (i.e. "Fido", "Rover")
   */
  public String getName() {
    return "*** No name defined - bummer ***";
  }
  
  /**
   * toString() is a method that all Java classes implement.  It's where you can 
   * generate a string that describes the object.  You should not override this
   * method unless you know what you're doing
   */
  @Override
  public String toString() {
    StringBuffer buffer = new StringBuffer("");
    buffer.append("It is a "+this.getType()+"\n");
    buffer.append("Its name is "+this.getName()+", it is "+this.getColor()+" with "+this.getLegs()+" legs\n");
    buffer.append("Its disposition is "+this.getDisposition()+" and it says "+this.speak()+"\n");
    return buffer.toString();
  }

  /** 
   * Getter for className
   * 
   * @return the class name
   */
  public String getClassName() {
    return this.getClass().getSimpleName();
  }
  
}
