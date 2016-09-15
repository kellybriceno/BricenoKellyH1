public class item {
  String name;
  int weight;
  
  public String getName() {
    return name; 
  }
  
  public void setName(int [] name) {
    this.name = name;
  }
  
  public int getWeight() {
    return weight;
  }
  
  public void setWeight(int[] weight) {
    this.weight = weight;
  }
  
  public String examine() {
    System.out.println(name + weight); 
  }
}