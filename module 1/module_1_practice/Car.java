public class Car extends Vehicle {
    private int doors;
    private String transmission;
    
    public Car(String Mark,String model,int year,int doors,String transmission){
        
        super(Mark,model,year);
        
        
        this.doors = doors;
        this.transmission = transmission; 
    }
    
}
