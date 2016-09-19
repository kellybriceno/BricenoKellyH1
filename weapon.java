import java.util.Random;

public class weapon {
  public class armor extends weapon{
    int damage;
    String name;
    int weight;
    int defense;
    
 
  
  // returns the integer defense
  public int getDefense() {
    return defense;
  }
  //setter for int defense
  public void setDefense(int df) {
    if(df >0) {
          defense = df;
    } else {
      System.out.println("Error! not defense!");
      System.exit(0); } }
          
  
  
  //returns the integer damage
  
  public int getDamage() {
    return damage;
  }
  //setter for damage property
  public void setDamage(int d) {
    if(d>0) {
          damage = d;
    } else {
      System.out.println("Error! not damage!");
      System.exit(0); } }
          
  }
  
 
  
  
}
