package entities;

public class ImportedProduct extends Product06 {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return super.getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return super.getName() + String.format(" $ %.2f ", totalPrice()) +
                String.format("(Custom fee: $ %.2f)", customsFee);
    }
}
