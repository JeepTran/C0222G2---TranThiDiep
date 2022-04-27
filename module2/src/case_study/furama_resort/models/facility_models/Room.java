package case_study.furama_resort.models.facility_models;

import case_study.furama_resort.models.Facility;

public class Room extends Facility {
    private String includedFreeService;

    public Room() {
    }

    public Room(String serviceName, Double usableArea, Integer rentalFee, Integer maximumPax, String rentalType, String includedFreeService) {
        super(serviceName, usableArea, rentalFee, maximumPax, rentalType);
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
        return "Room {" +super.toString()+
                "included free service='" + includedFreeService + '\'' +
                '}';
    }
}
