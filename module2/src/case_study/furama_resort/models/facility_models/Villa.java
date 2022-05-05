package case_study.furama_resort.models.facility_models;

import case_study.furama_resort.models.Facility;

import java.util.Objects;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private String numOfFloors;

    public Villa() {
    }

    public Villa(String serviceId, String serviceName, String usableArea, String rentalFee, String maximumPax, String rentalType, String roomStandard, String poolArea, String numOfFloors) {
        super(serviceId, serviceName, usableArea, rentalFee, maximumPax, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numOfFloors = numOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(String numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        return "Villa {" + super.toString() +
                ", room standard='" + roomStandard + '\'' +
                ", pool area=" + poolArea +
                ", number of floors=" + numOfFloors +
                '}';
    }
}
