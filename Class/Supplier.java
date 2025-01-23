package Class;
public class Supplier {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String typeOfNuts;
    private double pricePerUnit;
    private String shippingMethod;
    private double deliveryFee;
    private String address;

    public Supplier(String name, String emailAddress, String typeOfNuts, double pricePerUnit, String shippingMethod, double deliveryFee, String address) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.typeOfNuts = typeOfNuts;
        this.pricePerUnit = pricePerUnit;
        this.shippingMethod = shippingMethod;
        this.deliveryFee = deliveryFee;
        this.address = address;
    }

    // Getters and setters
    public String getName() { 
        return name; 
    }
    public void setName(String name) {
        this.name = name;
    }
}
