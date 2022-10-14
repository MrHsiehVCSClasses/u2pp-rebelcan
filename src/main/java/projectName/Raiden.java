package projectName;
public class Raiden extends Archon{

  //instance variables
  private String weapon;

  //default values
  public Raiden () {
    super();
    this.weapon = "unknown";

  }
  //constructors to create an object
  public Raiden (String name, int age, String region, String weapon) {
    super(name, age, region);
    this.weapon = weapon;
  
  }

  //get methods
  public String getWeapon () {
    return weapon;
  }
  //set method
  public void setWeapon(String newWeapon){
    this.weapon = newWeapon;
  }
  public String toString () {
    return super.toString() + ", friends with Raiden, uses " + weapon;
  }
}

   
//public class Raiden extends Archon{
   // public Raiden() {
        //super();
   // }
//}
//    class Raiden {
// private String weapon;
    
//public Raiden() {
  //      weapon = "polearm";
    //}
    //public Raiden(String newWeapon){
     //   weapon = newWeapon;
    //}
    //public String getWeapon(){
     //   return weapon;
    //}
    
    //}

