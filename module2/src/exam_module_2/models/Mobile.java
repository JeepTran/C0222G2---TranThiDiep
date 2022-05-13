package exam_module_2.models;

public abstract class Mobile {
    private Integer id;
    private String name;
    private Integer price;
    private Integer quantity;
    private String manufacturer;

    public Mobile() {
    }

    public Mobile(Integer id, String name, Integer price, Integer quantity, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", manufacturer='" + manufacturer + '\'';
    }

    public String getInfo(String delimiter) {
        return this.id + delimiter + this.name + delimiter + this.price +
                delimiter + this.quantity + delimiter + this.manufacturer;
    }
}
