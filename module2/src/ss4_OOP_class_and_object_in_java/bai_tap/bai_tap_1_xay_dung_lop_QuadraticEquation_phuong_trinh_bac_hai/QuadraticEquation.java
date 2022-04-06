package ss4_OOP_class_and_object_in_java.bai_tap.bai_tap_1_xay_dung_lop_QuadraticEquation_phuong_trinh_bac_hai;

import java.util.Scanner;

public class QuadraticEquation {
    // ax2 + bx + c = 0
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return (this.b * this.b - 4 * this.a * this.c);
    }

    public double getRoot1() {
        return ((-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a));

    }

    public double getRoot2() {
        return ((-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a));
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        this.a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter b: ");
        this.b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter c: ");
        this.c = Double.parseDouble(scanner.nextLine());
    }

    public String calculate() {
        if (this.getDiscriminant() > 0) {
            return "Root 1: " + this.getRoot1() +
                    "\nRoot 2: " + this.getRoot2();
        } else if (this.getDiscriminant() == 0) {
            return "1 Root: " + this.getRoot1();
        } else {
            return "No roots";
        }
    }
}
