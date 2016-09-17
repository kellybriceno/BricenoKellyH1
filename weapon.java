import java.util.Random;

public class weapon extends item {
  public class armor extends weapon {
    int damage;
  String name;
  int weight;
  int defense;
  // constructor?
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
  public void setDefense(int [] defense) {
    defense = new defense();
  }
  //returns the integer damage
  
  public int getDamage() {
    return damage;
  }
  
  public int setDamage(int[] damage) {
    this.setDamage = damage;
  }
  
  public String getName();
  
  
  public void runWeight()
  { 
    Test.getWeight();
  }
  
  
  public void runExamine()
  {
    Test.examine() ;
  }
  }
  }
