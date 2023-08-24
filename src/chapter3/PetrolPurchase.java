package chapter3;

public class PetrolPurchase {

    private String location;

    private String typeOfPetrol;

    private int quantity;

    private double price;


    private double percentageDiscount;

    public PetrolPurchase(String location, String typeOfPetrol, int quantity, double price, double percentageDiscount) {
        this.location = location;
        this.typeOfPetrol = typeOfPetrol;
        this.quantity = quantity;
        this.price = price;
        this.percentageDiscount = percentageDiscount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
    public double getPurchaseAmount(){
       double discount = percentageDiscount*(quantity*price)/100;
       double netPurchaseAmount = (quantity * price)- discount;
        return netPurchaseAmount;
    }



}
