package extra_assignment;

public class Truck extends Vehicles{
    private double taiTrong;

    public Truck() {
    }

    public Truck(String bienKS, String hangXe, int namSX, String chuXe, double taiTrong) {
        super(bienKS, hangXe, namSX, chuXe);
        this.taiTrong = taiTrong;
    }
}
