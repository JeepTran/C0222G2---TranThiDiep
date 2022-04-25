package case_study.furama_resort.models;

public abstract class Facility {
    private String serviceName;
    private Double usableArea;
    private Integer rentalFee;
    private Integer maximumPax;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, Double usingArea, Integer rentingFee, Integer maximumPax, String rentingType) {
        this.serviceName = serviceName;
        this.usableArea = usingArea;
        this.rentalFee = rentingFee;
        this.maximumPax = maximumPax;
        this.rentalType = rentingType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(Double usableArea) {
        this.usableArea = usableArea;
    }

    public Integer getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(Integer rentalFee) {
        this.rentalFee = rentalFee;
    }

    public Integer getMaximumPax() {
        return maximumPax;
    }

    public void setMaximumPax(Integer maximumPax) {
        this.maximumPax = maximumPax;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}
