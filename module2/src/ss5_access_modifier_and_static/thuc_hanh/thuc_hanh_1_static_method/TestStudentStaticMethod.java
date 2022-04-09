package ss5_access_modifier_and_static_method_and_static_property.thuc_hanh.thuc_hanh_1_static_method;

public class TestStudentStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "A");
        Student s2 = new Student(222, "B");
        Student s3 = new Student(333, "C");

        s1.display();
        s2.display();
        s3.display();
    }
}
