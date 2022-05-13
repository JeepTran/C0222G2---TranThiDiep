package exam_module_2.models;

public class ForeignMobile extends Mobile {
    private String country;
    private String status;

    public ForeignMobile() {
    }

    public ForeignMobile(Integer id, String name, Integer price, Integer quantity,
                         String manufacturer, String country, String status) {
        super(id, name, price, quantity, manufacturer);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ForeignMobile{" + super.toString() +
                ", country='" + country + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getInfo(String delimiter) {
        return super.getInfo(delimiter) + delimiter + this.country + delimiter + this.status;
    }
}
