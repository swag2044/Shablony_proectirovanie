public class Motorcycle extends Vehicle {
    private String kuzovtype;
    private String box;
    
    public Motorcycle(String Mark,String model,int year,String kuzovtype,String box){
        
        super(Mark,model,year);
        
        
        this.kuzovtype = kuzovtype;
        this.box = box; 
    }
    
}
