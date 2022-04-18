package extra_assignment;

public class Car extends Vehicles{
    private int soChoNgoi;
    private String kieuXe;

    public Car() {
    }

    public Car(String bienKS, String hangXe, int namSX, String chuXe, int soChoNgoi, String kieuXe) {
        super(bienKS, hangXe, namSX, chuXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }
}
