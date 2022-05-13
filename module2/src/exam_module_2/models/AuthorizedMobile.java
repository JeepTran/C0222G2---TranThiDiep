package exam_module_2.models;

public class AuthorizedMobile extends Mobile {
    private Integer insuranceTime;
    private String insuranceArea;

    public AuthorizedMobile() {
    }

    public AuthorizedMobile(Integer id, String name, Integer price, Integer quantity,
                            String manufacturer, Integer insuranceTime, String insuranceArea) {
        super(id, name, price, quantity, manufacturer);
        this.insuranceTime = insuranceTime;
        this.insuranceArea = insuranceArea;
    }

    public Integer getInsuranceTime() {
        return insuranceTime;
    }

    public void setInsuranceTime(Integer insuranceTime) {
        this.insuranceTime = insuranceTime;
    }

    public String getInsuranceArea() {
        return insuranceArea;
    }

    public void setInsuranceArea(String insuranceArea) {
        this.insuranceArea = insuranceArea;
    }

    @Override
    public String toString() {
        return "AuthorizedMobile{" + super.toString() +
                ", insuranceTime=" + insuranceTime +
                ", insuranceArea='" + insuranceArea + '\'' +
                '}';
    }

    public String getInfo(String delimiter) {
        return super.getInfo(delimiter) + delimiter + this.insuranceTime + delimiter + this.insuranceArea;
    }
}
