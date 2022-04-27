package case_study.furama_resort.models.facility_models;

import case_study.furama_resort.models.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private Double poolArea;
    private Integer numOfFloors;

    public Villa() {
    }

    public Villa(String serviceName, Double usingArea, Integer rentingFee, Integer maximumPax, String rentingType, String roomStandard, Double poolArea, Integer numOfFloors) {
        super(serviceName, usingArea, rentingFee, maximumPax, rentingType);
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

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(Integer numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        return "Villa {" + super.toString() +
                "room standard='" + roomStandard + '\'' +
                ", pool area=" + poolArea +
                ", number of floors=" + numOfFloors +
                '}';
    }
}
