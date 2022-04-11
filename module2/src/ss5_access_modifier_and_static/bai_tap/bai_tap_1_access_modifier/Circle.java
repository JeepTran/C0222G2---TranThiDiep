package ss5_access_modifier_and_static.bai_tap.bai_tap_1_access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
//     public: OK
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    //protected: OK
//    protected double getRadius() {
//        return this.radius;
//    }
//    protected double getArea() {
//        return this.radius * this.radius * Math.PI;
//    }

    // default: OK
//     double getRadius() {
//        return this.radius;
//    }
//     double getArea() {
//        return this.radius * this.radius * Math.PI;
//    }

    //private: ERROR
//    private double getRadius() {
//        return this.radius;
//    }
//    private double getArea() {
//        return this.radius * this.radius * Math.PI;
//    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle radius = " + circle.getRadius());
        System.out.println("Circle area = " + circle.getArea());
    }
}
