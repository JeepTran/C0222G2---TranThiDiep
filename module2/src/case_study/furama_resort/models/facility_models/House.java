package case_study.furama_resort.models.facility_models;

import case_study.furama_resort.models.Facility;

public class House extends Facility {
    private String roomStandard;
    private String numOfFloors;

    public House() {
    }

    public House(String serviceId, String serviceName, String usableArea, String rentalFee, String maximumPax, String rentalType, String roomStandard, String numOfFloors) {
        super(serviceId, serviceName, usableArea, rentalFee, maximumPax, rentalType);
        this.roomStandard = roomStandard;
        this.numOfFloors = numOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(String numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        final String DELIMITER = ";";
        return this.getServiceId() + DELIMITER + this.getServiceName() + DELIMITER + this.getUsableArea() + DELIMITER +
                this.getRentalFee() + DELIMITER + this.getMaximumPax() + DELIMITER + this.getRentalType() + DELIMITER +
                this.getRoomStandard() + DELIMITER + this.getNumOfFloors();

    }

    public String getInfo() {
        return "House {" + super.toString() +
                ", room standard='" + roomStandard + '\'' +
                ", number of floors=" + numOfFloors +
                '}';
    }
}
