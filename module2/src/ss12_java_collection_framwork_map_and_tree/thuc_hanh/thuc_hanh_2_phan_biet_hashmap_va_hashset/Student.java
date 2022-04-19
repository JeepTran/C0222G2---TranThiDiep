package ss12_java_collection_framwork_map_and_tree.thuc_hanh.thuc_hanh_2_phan_biet_hashmap_va_hashset;

import ss12_java_collection_framwork_map_and_tree.thuc_hanh.thuc_hanh_3_sap_xep_voi_comparable_va_comparator.IStudent;

public class Student implements IStudent {
    private String name;
    private Integer age;
    private String address;

    public Student() {
    }

    public Student(String name, Integer age, String adress) {
        this.name = name;
        this.age = age;
        this.address = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student student){
        return this.getName().compareTo(student.getName());
    }
}
