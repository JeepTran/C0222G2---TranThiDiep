package case_study.furama_resort.models.facility_models;

import case_study.furama_resort.models.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private Double poolArea;
    private Integer numOfFloor;

    public Villa() {
    }

    public Villa(String serviceName, Double usingArea, Integer rentingFee, Integer maximumPax, String rentingType, String roomStandard, Double poolArea, Integer numOfFloor) {
        super(serviceName, usingArea, rentingFee, maximumPax, rentingType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numOfFloor = numOfFloor;
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

    public Integer getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(Integer numOfFloor) {
        this.numOfFloor = numOfFloor;
    }
}
