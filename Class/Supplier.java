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

    public Supplier(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Getters and setters
    public String getName() { 
        return name; 
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
