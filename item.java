import java.util.Random;

//created public class item
public class item {
 //created properties for class
  public String name;
  public int weight;
  
  // constructor for class item
  public item(String getName, int getWeight, String examine) {
    name = getName;
    weight = getWeight;
    examine = examine;
}
  //method returns string name
  public String getName() {
    return name; 
  }
  //method sets string name
  public String setName; {
    name = "Kelly";
  }
  //method returns integer weight
  public int getWeight() {
    return weight;
  }
  //method sets integer weight
  public int setWeight; {
    int[] weight = {50,51};
  }
  //method to print a description of object and name and weight
  public String examine; {
    System.out.print("description of object" + name + weight); 
  }
}