package ss7_abstract_class_and_interface.thuc_hanh.thuc_hanh_3_trien_khai_interface_comparator_de_so_sanh_cac_lop_hinh_hoc;

import ss6_inheritance.thuc_hanh.thuc_hanh_he_cac_doi_tuong_hinh_hoc.Circle;
import ss7_abstract_class_and_interface.thuc_hanh.thuc_hanh_2_trien_khai_interface_comparable_cho_cac_lop_hinh_hoc.ComparableCircle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0]= new Circle(3.5);
        circles[1]= new Circle();
        circles[2]= new Circle("black",true,2);

        System.out.println("Pre-sorted: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After-sorted");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
