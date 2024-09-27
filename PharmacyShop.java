public class PharmacyShop {
    private Person owner;
    private Address address;
    private Medicine[] medicines;
    private double totalProfit;

    public PharmacyShop(Person owner, Address address) {
        this.owner = owner;
        this.address = address;
        this.totalProfit = 0;

        this.medicines = new Medicine[] {
                new Medicine("001", "Paracetamol","PharmaCorp" , 100, "PharmaCorp", 100.0, new Date(15,12,2024)),
                new Medicine("002", "Ibuprofen", "Abbot", 80, "HealthMed", 300.00, new Date(25,12,2024)),
                new Medicine("003", "Amoxicillin", "Abbot", 50, "BioPharma", 250.0, new Date(1,11,2024) ),
                new Medicine("004", "Ciprofloxacin", "PharmaCorp", 60, "MedLife", 600.0, new Date(9,3,2024)),
                new Medicine("005", "Metformin", "Serale", 70, "GlucoCare", 900.0, new Date(9,12,2024)),
        };
    }

    public void addMedicine(Medicine medicine) {
        System.out.println("Medicine are added successfully.");
    }

    public void updateMedicine(String id, int newQuantity, double newPrice) {
        for (Medicine medicine : medicines) {
            if (medicine.getMedicineId().equals(id)) {
                medicine.setPrice(newPrice);
                medicine.setQuantity(newQuantity);
                System.out.println("Medicine are  updated successfully.");
                return;
            }
        }
        System.out.println("Medicine are not found.");
    }

    public void removeMedicine(String id) {
        System.out.println("Medicine  are removed successfully.");
    }

    public void sellMedicine(String id, int quantitySold) {
        for (Medicine medicine : medicines) {
            if (medicine.getMedicineId().equals(id)) {

                    totalProfit += medicine.getPrice() * quantitySold;
                    System.out.println("Medicine are sold successfully.");

                return;
            }
        }
        System.out.println("Medicine are not found.");
    }

    public void displayAllMedicines() {
        for (Medicine medicine : medicines) {
            medicine.displayMedicine();
        }
    }

    public void searchMedicine(String q) {
        for (Medicine medicine : medicines) {
            if (medicine.getMedicineId().equals(q)){
                medicine.displayMedicine();
                return;
            }
        }
        System.out.println("Medicine are not found.");
    }

    public void printTotalProfit() {
        System.out.println("Total Revenue from the medicine is : " + totalProfit);
    }


}
