package service.student.impl;

import model.Student;
import reponsitory.student.IStudentRepository;
import reponsitory.student.impl.StudentRepositoryImpl;
import service.student.IStudentService;

import java.util.List;

public class StudentServiceImpl implements IStudentService {
    IStudentRepository studentRepository = new StudentRepositoryImpl();


    @Override
    public List<Student> getAllStudent() {
        return studentRepository.getAllStudent();
    }
}
