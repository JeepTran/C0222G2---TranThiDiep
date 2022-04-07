package ss4_OOP_class_and_object_in_java.bai_tap.bai_tap_3_xay_dung_lop_Fan;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(1, false, 5, "blue");
        System.out.println("Fan1: " + fan1.toString());
        System.out.println("Fan2: " + fan2.toString());
    }
}
