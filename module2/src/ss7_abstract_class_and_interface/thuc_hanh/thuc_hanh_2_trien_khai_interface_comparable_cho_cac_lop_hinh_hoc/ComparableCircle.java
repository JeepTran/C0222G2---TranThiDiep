package ss7_abstract_class_and_interface.thuc_hanh.thuc_hanh_2_trien_khai_interface_comparable_cho_cac_lop_hinh_hoc;

import ss6_inheritance.thuc_hanh.thuc_hanh_he_cac_doi_tuong_hinh_hoc.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(){
    }
    public ComparableCircle(double radius){
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

   @Override
    public int compareTo(ComparableCircle o){
        if (getRadius()>o.getRadius()) return 1;
        else if (getRadius()<o.getRadius()) return -1;
        else return 0;
   }

}
