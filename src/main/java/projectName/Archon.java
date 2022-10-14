package projectName;
public class Archon {

  //instance variables
  private String name; 
  private int age; 
  private String region;

  //constructor to create Archon with name and age
  public Archon(String name, int age, String region) {
    this.name = name;
    this.age = age;
    this.region = region;
  }

  //constructor to create Archon with no name and age of 500
  public Archon() {
    this.name = " ";
    this.age = 500;
    this.region = " ";
  }
  
  //get method
  public String getName (){
    return name;
  }
  public int getAge() {
    return age;
  }
  public String getRegion (){
    return region;
  }
  

  //set method
  public void setName (String newName) {
    this.name = newName;
  }
  public void setAge (int newAge) {
    this.age = newAge;
  }
  public void setRegion (String newRegion) {
    this.region = newRegion;
  }

  public String toString() {
    return "Name: " + name + ", Age = " + age + ", Region: " + region;
  }
}
  // public static void main(String[] args) {
  //   Scanner myObj = new Scanner(System.in); //create scanner object
  //   System.out.println("Enter an archon. Venti or Raiden");

  //   String archonName = myObj.nextLine(); //read user input
  //   System.out.println("Chosen archon is: " + archonName); //output user input

  //   Archon myArchon = new Archon(); //custom archon
  //     System.out.println(myArchon.archonName);
  //     System.out.println("Enter your name, age, and region.");

  //     String name = myArchon.nextLine();
  //     String region = myArchon.nextLine();
  //     int age = myArchon.nextInt();

  //     //output input by user
  //     System.out.println("Name: " + name);
  //     System.out.println("Archon of:" + region);
  //     System.out.println("Age: " + age);
  // }
  // //attributes
  // String weapon;
  // String vision;



      
    
   //end of class
    


  //public static void main(String[] args) {
    //Scanner input = new Scanner (System.in);
   // System.out.println("Choose an Archon. Venti or Raiden. :");
   // var archonName =(Venti. Raiden);
   // archonName = input.next();
   // input.close();
   // if (input = Raiden) {
      //System.out.println("Name: Raiden Shogun. Region: Inazuma. Vision: Electro.");
   // }
  //  if (input = Venti) {
  //    System.out.println("Name: Venti. Region: Mondstadt. Vision: Anemo.");
  //  }
    
    
  //}
//}

