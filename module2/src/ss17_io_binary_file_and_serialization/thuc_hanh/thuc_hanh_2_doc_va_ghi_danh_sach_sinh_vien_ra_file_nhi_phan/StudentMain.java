package ss17_io_binary_file_and_serialization.thuc_hanh.thuc_hanh_2_doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        String path = "E:\\CodeGym 02.2022\\C0222G2\\C0222G2_TranThiDiep\\module2\\src\\ss17_io_binary_file_and_serialization\\thuc_hanh\\thuc_hanh_2_doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan\\Student.txt";
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"A","Da Nang"));
        studentList.add(new Student(2,"D","Quang Nam"));
        studentList.add(new Student(3,"E","Ha Noi"));
        studentList.add(new Student(4,"F","Da Nang"));
        writeToFile(path,studentList);

        List<Student> studentDataFromFile = readDataFromFile(path);
        for (Student student:studentDataFromFile) {
            System.out.println(student);
        }

    }
    public static List<Student> readDataFromFile(String path){
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return studentList;
    }
    public static void writeToFile(String path, List<Student> studentList){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();
            fos.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
