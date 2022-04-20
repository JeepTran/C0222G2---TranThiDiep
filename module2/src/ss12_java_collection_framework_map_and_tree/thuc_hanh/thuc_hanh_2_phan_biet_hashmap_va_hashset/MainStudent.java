package ss12_java_collection_framework_map_and_tree.thuc_hanh.thuc_hanh_2_phan_biet_hashmap_va_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainStudent {
    public static void main(String[] args) {
        Student student1= new Student("A",19,"ĐN");
        Student student2= new Student("D",21,"HN");
        Student student3= new Student("E",20,"SG");
        Student student4= new Student("H",26,"QB");

        Map<Integer, Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student4);
        for (Map.Entry<Integer,Student> student: studentMap.entrySet() ) {
            System.out.println(student.toString());
        }

        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        for (Student student:studentSet ) {
            System.out.println(student.toString());
        }

    }
}
