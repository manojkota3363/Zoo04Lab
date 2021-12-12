package edu.nwmissouri.zoo04lab;

public class Park{
    
    // instance variables
    private String name = "Unknown";
    private String city = "Unknown";
    
    // constructors
    Park(){
        this.name = "Default Name";
        this.city = "Default City";
    }
    
    Park(String nameIn, String cityIn){
        this.name = nameIn;
        this.city = cityIn;
    }
    
    // instance methods
    public String getName() {
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
  
      // static methods
    public static void showGreeting(){
        System.out.println("Welcome to our place!");
    }
    
    public static void main(String[] args){
        
        // show greeting (call the static method)
        Park.showGreeting();
        // create a new instance
        Park p = new Park("Tree World", "Maryville");
        
        // display the name of this instance
        System.out.println(p.getName());
    }
}