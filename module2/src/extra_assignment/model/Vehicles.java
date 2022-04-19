package extra_assignment.model;

import java.util.Scanner;

public abstract class Vehicles {
    private String numberPlate;
    private String company;
    private int manufacturingYear;
    private String owner;

    public Vehicles() {
    }

    public Vehicles(String numberPlate, String company, int manufacturingYear, String owner) {
        this.numberPlate = numberPlate;
        this.company = company;
        this.manufacturingYear = manufacturingYear;
        this.owner = owner;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "numberPlate='" + numberPlate + '\'' +
                ", company='" + company + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                ", owner='" + owner + '\'' +
                '}';
    }
}
