package case_study.furama_resort.models.facility_models;

import case_study.furama_resort.models.Facility;

public class Room extends Facility {
    private String includedFreeService;

    public Room() {
    }

    public Room(String serviceName, Double usingArea, Integer rentingFee, Integer maximumPax, String rentingType, String includedFreeService) {
        super(serviceName, usingArea, rentingFee, maximumPax, rentingType);
        this.includedFreeService = includedFreeService;
    }

    public String getIncludedFreeService() {
        return includedFreeService;
    }

    public void setIncludedFreeService(String includedFreeService) {
        this.includedFreeService = includedFreeService;
    }
}
