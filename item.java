import java.util.Random;

//created public class item
public class item {
 //created properties for class
  String name;
  int weight;
  
  //method returns string name
  public String getName() {
    return name; 
  }
  //method sets string name
  public String setName; {
    this.name = name;
  }
  //method returns integer weight
  public int getWeight() {
    return weight;
  }
  //method sets integer weight
  public int setWeight; {
   this.weight = weight;
  }
  //method to print a description of object and name and weight
  public String examine; {
    System.out.print("description of object" + name + weight); 
  }
}