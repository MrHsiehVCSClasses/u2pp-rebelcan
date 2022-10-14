package projectName;
public class Venti extends Archon{

    //instance variables
    private String vision;

    //default values
    public Venti () {
        super();
        this.vision = "unknown";
    }
    //constructors to create an object
    public Venti (String name, int age, String region, String vision) {
        super(name, age, region);
        this.vision = vision;
    }

    //get method
    public String getVision(){
        return vision;
    }

    //set method
    public void setVision (String newVision){
        this.vision = newVision;
    }

    //toString
    public String toString(){
        return super.toString() + ", friends with Venti, wields " + vision;
    }
}