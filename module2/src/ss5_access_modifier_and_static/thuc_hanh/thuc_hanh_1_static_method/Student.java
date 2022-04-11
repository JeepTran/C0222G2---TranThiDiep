package ss5_access_modifier_and_static.thuc_hanh.thuc_hanh_1_static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "ABC";
    Student(){

    }
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno + " " + name +" " + college);
    }
}
