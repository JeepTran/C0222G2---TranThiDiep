package case_study.furama_resort.models.facility_models;

import case_study.furama_resort.models.Facility;

public class Room extends Facility {
    private String includedFreeService;

    public Room() {
    }

    public Room(String serviceId, String serviceName, String usableArea, String rentalFee,
                String maximumPax, String rentalType, String includedFreeService) {
        super(serviceId, serviceName, usableArea, rentalFee, maximumPax, rentalType);
        this.includedFreeService = includedFreeService;
    }

    public String getIncludedFreeService() {
        return includedFreeService;
    }

    public void setIncludedFreeService(String includedFreeService) {
        this.includedFreeService = includedFreeService;
    }

    @Override
    public String toString() {
        final String DELIMITER = ";";
        return this.getServiceId() + DELIMITER + this.getServiceName() + DELIMITER + this.getUsableArea() + DELIMITER +
                this.getRentalFee() + DELIMITER + this.getMaximumPax() + DELIMITER + this.getRentalType() + DELIMITER +
                this.getIncludedFreeService();
    }

    public String getInfo() {
        return "Room {" + super.toString() +
                ", included free service='" + includedFreeService + '\'' +
                '}';
    }
}
