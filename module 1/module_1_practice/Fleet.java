import java.util.ArrayList;

public class Fleet {
    private ArrayList<Garage> garages = new ArrayList();

    public void addGarage(Garage garage){
        garages.add(garage);
        System.out.println(garage  +"  добавлен в флит");
    }
    public void removeGarage(Garage garage){
        garages.remove(garage);
        System.out.println(garage + "  удален из флита");
    }

    public Vehicle findVehicle(String model){
         for(Garage g : garages){ for(Vehicle v : g.getVehicles())
            { if(v.getModel().equals(model))
                { return v;

                 } 
                } 
            } return null; 
        }

    
}
