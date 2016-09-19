import java.util.Random;

public class food extends item {
  // set properties
  int nutrition;
  int quantity;
  
  
// getter method to get integer nutrition
  public int getNutrition() {
    return nutrition;
}
  //setter method for integer nutrition 
  
   public void setNutrition(int n) {
    if(n>0) {
          nutrition = n;
    } else {
      System.out.println("Error! not nutrition!");
      System.exit(0); } }
  
  //getter method to get integer quantity
  public int getQuantity() {
    return quantity;
  }
  
  //setter for integer quantity
  public void setQuantity(int newQuantity) {
    quantity = newQuantity; 
 
  } 
  
}
  
  