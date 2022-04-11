package ss5_access_modifier_and_static.thuc_hanh.thuc_hanh_2_static_property;

public class TestCarStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes","Skyactiv 1");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mercedes","Skyactiv 2");
        System.out.println(Car.numberOfCars);
    }



}
