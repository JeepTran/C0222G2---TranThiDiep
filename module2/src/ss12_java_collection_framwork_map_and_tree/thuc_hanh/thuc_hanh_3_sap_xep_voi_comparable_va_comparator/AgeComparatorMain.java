package ss12_java_collection_framwork_map_and_tree.thuc_hanh.thuc_hanh_3_sap_xep_voi_comparable_va_comparator;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import ss12_java_collection_framwork_map_and_tree.thuc_hanh.thuc_hanh_2_phan_biet_hashmap_va_hashset.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AgeComparatorMain {
    public static void main(String[] args) {
        Student student1 = new Student("A",17,"ĐN");
        Student student2 = new Student("C",25,"QN");
        Student student3 = new Student("E",23,"QT");
        Student student4 = new Student("K",30,"QB");

        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
//       Collections.sort(list);
        for (Student student:list) {
            System.out.println(student.toString());
        }
AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("Compare by age: ");
        for (Student student:list  ) {
            System.out.println(student.toString());
        }

    }
}
