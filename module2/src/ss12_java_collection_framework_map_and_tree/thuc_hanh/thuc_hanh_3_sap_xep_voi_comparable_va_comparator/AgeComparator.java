package ss12_java_collection_framework_map_and_tree.thuc_hanh.thuc_hanh_3_sap_xep_voi_comparable_va_comparator;

import ss12_java_collection_framework_map_and_tree.thuc_hanh.thuc_hanh_2_phan_biet_hashmap_va_hashset.Student;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge()>o2.getAge()){
            return 1;
        } else if (o1.getAge()< o2.getAge()){
            return -1;
        } else{
            return 0;
        }
    }
}
