package entities;

public class Product {

    private int id;
    private int categoryId;
    private String name;
    private double price;
    private int quantity;
    private int measurementUnitId;

    public Product() {
    }

    public Product(int id, int categoryId, String name, double price, int quantity, int measurementUnitId) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.measurementUnitId = measurementUnitId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getMeasurementUnitId() {
        return measurementUnitId;
    }

    public void setMeasurementUnitId(int measurementUnitId) {
        this.measurementUnitId = measurementUnitId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", measurementUnitId=" + measurementUnitId +
                '}';
    }
}
