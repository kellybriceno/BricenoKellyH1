import java.util.Random;
public class test {
  public static void main (String [] args) {
    int[] nutrition = {7,10};
    int[] quantity = {40,41};
    int[] weight = {50,51};
    String name = "kelly";
      int[] damage = {6,7};
      int[] defense = {5,4};
     
     weapon one  = new weapon(nutrition, quantity, weight, "kelly", damage, defense);
    
    // tests that Constructor initializes properly
    System.out.print("Damage; ");
    for (int i = 0; i < go.getTester().length; i++) {
       System.out.print(go.getTester()[i] + " "); 
    }
    System.out.println("");
    
    // tests that Constructor initializes location properly
    System.out.print("Defense: ");
    for (int i = 0; i < go.getDefense().length; i++) {
       System.out.print(go.getDefense()[i] + " "); 
    }
    System.out.println("");

    // tests that Constructor initializes spawn location properly
    System.out.print("Weight: ");
    for (int i = 0; i < go.getWeight().length; i++) {
       System.out.print(go.getWeight()[i] + " "); 
    }
    System.out.println("");
    
    // tests that Constructor initializes name properly
    System.out.print("name: ");
    System.out.println(go.getName()); 

    
    // movement test
    dude.moveUp(); // expect y axis to be 51
    System.out.println("Test moveUp()");
    // tests that Constructor initializes location properly
    System.out.print("Quantity: ");
    for (int i = 0; i < go.getQuantity().length; i++) {
       System.out.print(go.getQuantity()[i] + " "); 
    }
    System.out.println("");
    
    dude.moveDown(); // expect y axis to be 41
    System.out.println("Test moveDown()");
    // tests that Constructor initializes location properly
    System.out.print("Nutrition: ");
    for (int i = 0; i < dude.getNutrition().length; i++) {
       System.out.print(dude.getNutrition()[i] + " "); 
    }
    System.out.println("");
    
    
    // testing setters
    System.out.println("testing Setters:");
    int[] defense1 = {5,4};
    go.setDefense(defense1);
    int[] damage1 = {6,7};
    go.setDamage(damage1);
    int[] quantity1 = {40,41};
    go.setquantity(quantity1);
    int [] nutrition1 = {7,10};
    go.setNutrition(nutrition1);
    int[] weight1 = {50,51};
    go.setWeight(weight1);
    go.setName("somethingDifferent");
    // tests that setters set nutrition  properly
    System.out.print("Nutrition: ");
    for (int i = 0; i < go.getNutrition().length; i++) {
       System.out.print(go.getNutrition()[i] + " "); 
    }
    System.out.println("");
    
    // tests that Constructor initializes weight properly
    System.out.print("Weight;");
    for (int i = 0; i < go.getWeight().length; i++) {
       System.out.print(go.getWeight()[i] + " "); 
    }
    System.out.println("");

    // tests that Constructor initializes defense properly
    System.out.print("Defense: ");
    for (int i = 0; i < go.getDefense().length; i++) {
       System.out.print(go.getDefense()[i] + " "); 
    }
    System.out.println("");
    
   //test that constuctor intializes damage property 
       System.out.print("Damage: ");
    for (int i = 0; i < go.getDamage().length; i++) {
       System.out.print(go.getDamage()[i] + " "); 
    }
    System.out.println("");
    
    // tests that Constructor initializes name properly
    System.out.print("name: ");
    System.out.println(dude.getName()); 
  }
}