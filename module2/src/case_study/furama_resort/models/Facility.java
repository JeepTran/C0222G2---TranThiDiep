package case_study.furama_resort.models;

import java.util.Objects;

public abstract class Facility {
    private String serviceId;
    private String serviceName;
    private String usableArea;
    private String rentalFee;
    private String maximumPax;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceId, String serviceName, String usableArea, String rentalFee, String maximumPax, String rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalFee = rentalFee;
        this.maximumPax = maximumPax;
        this.rentalType = rentalType;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(String rentalFee) {
        this.rentalFee = rentalFee;
    }

    public String getMaximumPax() {
        return maximumPax;
    }

    public void setMaximumPax(String maximumPax) {
        this.maximumPax = maximumPax;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Facility)) return false;
        Facility facility = (Facility) o;
        return Objects.equals(serviceId, facility.serviceId) && Objects.equals(serviceName, facility.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, serviceName);
    }

    @Override
    public String toString() {
        return "serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentalFee='" + rentalFee + '\'' +
                ", maximumPax='" + maximumPax + '\'' +
                ", rentalType='" + rentalType + '\'';
    }
}
