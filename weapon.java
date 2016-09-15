public class weapon extends item {
  int damage;
  String name;
  int weight;
  
  public int getDamage() {
    return int damage;
  }
  
  public void setDamage(int[] damage) {
    this.setDamage = damage;
  }
  
  public void setName(String[]name) {
    this.setName = name;
  }
  
  public getName() {
    return String name;
  }
  
  
  public getWeight() {
    return int weight;
  }
  
  public void setWeight(Int[] weight) {
    this.setWeight = weight;
  }
  
  
  public examine() {
    System.out.println(name + weight);
  }