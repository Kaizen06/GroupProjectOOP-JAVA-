package Class;
public class Customer {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String address;
    private String paymentMethod;
    private String typeOfNuts;
    private double quantity;
    private String feedback;

    public Customer(String name, String emailAddress, String address) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.address = address;
    }
    
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
}
