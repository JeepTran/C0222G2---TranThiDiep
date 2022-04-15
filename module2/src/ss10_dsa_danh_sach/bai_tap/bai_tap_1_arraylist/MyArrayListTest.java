package ss10_dsa_danh_sach.bai_tap.bai_tap_1_arraylist;

import java.util.Arrays;

public class MyArrayListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Bill");
        Student b = new Student(2, "BillGate");
        Student c = new Student(3, "BillBob");
        Student d = new Student(4, "BillClinton");
        Student e = new Student(5, "BillMan");
        Student f = new Student(6, "BillWoman");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();

        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
//        studentMyArrayList.add(f, 3);
        //        studentMyArrayList.clear();

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.print(student.getId() + "\t");
            System.out.println(student.getName());
        }
        System.out.println("size: " + studentMyArrayList.size());
        System.out.println(studentMyArrayList.get(3).getName());
        System.out.println(studentMyArrayList.indexOf(f));
        System.out.println(studentMyArrayList.contains(d));

        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        newMyArrayList = studentMyArrayList.clone();
        for (int i = 0; i < newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }
        newMyArrayList.remove(3);
        for (int i = 0; i < newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i).getId());
            System.out.println(newMyArrayList.get(i).getName());
        }
    }
}
