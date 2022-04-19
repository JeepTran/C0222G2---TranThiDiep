package extra_assignment.model;

public class Company {
    private int manufacturingId;
    private String manufacturer;
    private String manufacturingCountry;

    public Company() {
    }

    public Company(int manufacturingId, String manufacturer, String manufacturingCountry) {
        this.manufacturingId = manufacturingId;
        this.manufacturer = manufacturer;
        this.manufacturingCountry = manufacturingCountry;
    }

    public int getManufacturingId() {
        return manufacturingId;
    }

    public void setManufacturingId(int manufacturingId) {
        this.manufacturingId = manufacturingId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturingCountry() {
        return manufacturingCountry;
    }

    public void setManufacturingCountry(String manufacturingCountry) {
        this.manufacturingCountry = manufacturingCountry;
    }
}
