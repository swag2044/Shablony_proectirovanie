
public class OrderService {


public void CreateOrder(String productName,int quantity,double price,String type){
    System.out.println("Order for "+productName+type+"Total:"+ quantity*price);
}
}


