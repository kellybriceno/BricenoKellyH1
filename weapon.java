public class weapon extends item {
  public class armor extends weapon {
    int damage;
  String name;
  int weight;
  int defense;
  // returns the integer defense
  public int getDefense() {
    return int defense;
  }
  public void setDefense(int [] defense) {
    defense = new defense;
  //returns the integer damage
  }
  public int getDamage() {
    return int damage;
  }
  
  public void setDamage(int[] damage) {
    this.setDamage = damage;
  }
  
  public void setName(String[]name) {
    this.setName = name;
  }
  
  public String getName();
  
  
  public getWeight() {
    return int weight;
  }
  
  public void setWeight(Int[] weight) {
    this.setWeight = weight;
  }
  
  
  public examine() {
    System.out.println(name + weight);
  }
  }
