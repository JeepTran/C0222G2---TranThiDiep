package ss5_access_modifier_and_static_method_and_static_property.bai_tap.bai_tap_2_xay_dung_lop_chi_ghi_trong_java;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Bill");
        student.setClasses("C0222G2");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
