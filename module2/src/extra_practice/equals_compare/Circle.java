package extra_practice.equals_compare;


public class Circle implements Comparable<Circle> {
    private int id;
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

    @Override
    public boolean equals(Object o) {
        Circle circle = (Circle) o;
        if (this.id == circle.id) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public int compareTo(Circle o) {
        if (this.id == o.id) {
            return 0;
        } else if (this.id > o.id) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle2 = new Circle();
        System.out.println(circle);
        System.out.println(circle2);
        System.out.println(circle.equals(circle2));
        System.out.println("Circle area = " + circle.getArea());
    }
}

