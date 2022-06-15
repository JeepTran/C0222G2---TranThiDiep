package reponsitory.student.impl;

import model.Class;
import model.Student;
import reponsitory.BaseRepository;
import reponsitory.student.IStudentRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements IStudentRepository {
    BaseRepository baseRepository = new BaseRepository();
    private final String SELECT_ALL_STUDENT = " select * from student ";

    @Override
    public List<Student> getAllStudent() {
        List<Student> studentList = new ArrayList<>();
        try(Connection connection = baseRepository.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STUDENT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("student_id");
                String name = resultSet.getString("student_name");
                int classId = resultSet.getInt("class_id");
                studentList.add(new Student(id,name,classId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return studentList;
    }
}
