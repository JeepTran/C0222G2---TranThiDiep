package case_study.furama_resort.models;

public abstract class Facility {
    private String serviceName;
    private Double usableArea;
    private Integer rentalFee;
    private Integer maximumPax;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, Double usableArea, Integer rentalFee, Integer maximumPax, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalFee = rentalFee;
        this.maximumPax = maximumPax;
        this.rentalType = rentalType;
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

    @Override
    public String toString() {
        return  "service name='" + serviceName + '\'' +
                ", usable area=" + usableArea +
                ", rental fee=" + rentalFee +
                ", maximum pax=" + maximumPax +
                ", rental type='" + rentalType + '\'';
    }
}
