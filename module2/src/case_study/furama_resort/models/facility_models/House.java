package case_study.furama_resort.models.facility_models;

import case_study.furama_resort.models.Facility;

public class House extends Facility {
    private String roomStandard;
    private Integer numOfFloors;

    public House() {
    }

    public House(String serviceName, Double usingArea, Integer rentingFee, Integer maximumPax, String rentingType, String roomStandard, Integer numOfFloors) {
        super(serviceName, usingArea, rentingFee, maximumPax, rentingType);
        this.roomStandard = roomStandard;
        this.numOfFloors = numOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Integer getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(Integer numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        return "House {" + super.toString()+
                "room standard='" + roomStandard + '\'' +
                ", number of floors=" + numOfFloors +
                '}';
    }
}
