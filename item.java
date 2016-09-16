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
  public void setName(String [] name) {
    name = new name;
  }
  //method returns integer weight
  public int getWeight() {
    return weight;
  }
  //method sets integer weight
  public void setWeight(int[] weight) {
   weight = new weight;
  }
  //method to print a description of object and name and weight
  public String examine() {
    System.out.println("description of object" + name + weight); 
  }
}