public class Medicine {
//    Declaring Variables

    private String medicineId;
    private String batchNumber;
    private String manufacturer;
    private int quantity;
    private String name;
    private double price;
    private Date expiryDate;
// Constructor
    public Medicine(String medicineId, String batchNumber, String manufacturer, int quantity, String name, double price, Date expiryDate) {
        this.medicineId = medicineId;
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

// Setter and Getter
    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

//    Display
    public void displayMedicine(){
        System.out.println("Medicine ID: " + medicineId);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Quantity: " + quantity);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        expiryDate.displayDate();
    }
}
