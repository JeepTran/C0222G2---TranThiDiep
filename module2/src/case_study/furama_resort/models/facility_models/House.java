package case_study.furama_resort.models.facility_models;

import case_study.furama_resort.models.Facility;

public class House extends Facility {
    private String roomStandard;
    private Integer numOfFloor;

    public House() {
    }

    public House(String serviceName, Double usingArea, Integer rentingFee, Integer maximumPax, String rentingType, String roomStandard, Integer numOfFloor) {
        super(serviceName, usingArea, rentingFee, maximumPax, rentingType);
        this.roomStandard = roomStandard;
        this.numOfFloor = numOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Integer getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(Integer numOfFloor) {
        this.numOfFloor = numOfFloor;
    }
}
