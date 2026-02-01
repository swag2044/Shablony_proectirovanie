public class Vehicle{
    public void Start(String typeofvehicle,boolean engine){
        if(engine == true){
        System.out.println(typeofvehicle+"is starting");
        }
        else{ 
            System.out.println(typeofvehicle+"is stopping");}
    }
}