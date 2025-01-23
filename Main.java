import Class.Nut;
import Class.Supplier;
import Class.Customer;
import Class.Order;
import Class.OrderItem;
import Class.Inventory;

public class Main {
    public static void main(String[] args) {
        
        Nut myNut = new Nut("Cashew", "drupe", 5, "KompongCham", 10 );

        System.out.println("This is Nut information: "
                            + "\nName: " + myNut.getName()
                            + "\nType: " + myNut.getType()
                            + "\nPrice per Kg:" + myNut.getPricePerKg()
                            + "\nOrigin:" + myNut.getOrigin()
                            + "\nstockQuantity:" + myNut.getStockQuantity()
                        );
    }
}