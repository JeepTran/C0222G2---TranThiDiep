package model;

public class Student {
    private int studentId;
    private String studentName;
    private int classId;

    public Student() {
    }

    public Student(int studentId, String studentName, int stdClass) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.classId = stdClass;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
