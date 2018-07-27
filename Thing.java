package Hibernate;

public class Thing {
   private int number;
   private String name;    
   private int weight;  

   public Thing() {}
   public Thing(String name, int weight) {
      this.name = name;
      this.weight = weight;
   }
   
   public int getNumber() {
      return number;
   }
   
   public void setNumber( int num ) {
      this.number = num;
   }
   
   public String getName() {
      return name;
   }
   
   public void setFirstName( String name ) {
      this.name = name;
   }
    
   public int getWeight() {
      return weight;
   }
   
   public void setSalary( int weight ) {
      this.weight = weight;
   }
}
