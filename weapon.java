import java.util.Random;

public class weapon extends item {
  public class armor extends weapon {
    int damage;
  String name;
  int weight;
  int defense;
  // constructor for weapon class 
   public int weapon(int[] damage, int[] weight, int[] defense, String[]name) {
    this.damage = damage;
    this.name = name; 
    this.weight = weight;
    this.defense = defense; 
  }
  
  // returns the integer defense
  public int getDefense() {
    return defense;
  }
  //setter for int defense
  public void setDefense(int [] defense) {
    defense = new defense();
  }
  //returns the integer damage
  
  public int getDamage() {
    return damage;
  }
  
  public void setDamage(int d) {
    if(d>0) {
          damage = d;
    } else {
      System.out.println("Error! not damage!");
      System.exit(0); } }
          
  }
  
  public void runName() {
    getName(); 
  }
  
  public void runWeight()
  { 
    getWeight();
  }
  
  
  public String runExamine()
  {
    System.out.print("description of object" + name + weight); 
  }
  }
  
  
  
