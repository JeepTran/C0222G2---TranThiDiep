package extra_assignment;

public class Motorbike extends Vehicles{
    private double congSuat;

    public Motorbike() {
    }

    public Motorbike(String bienKS, String hangXe, int namSX, String chuXe, double congSuat) {
        super(bienKS, hangXe, namSX, chuXe);
        this.congSuat = congSuat;
    }
}
