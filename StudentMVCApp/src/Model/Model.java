package Model;

import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudent()
    {
        return students;
    }

    public void DeleteStudent(long StudID){
        boolean HaveNumber = false;
        for (Student student : students) {
            if (student.getStudentID() == StudID){
                HaveNumber = true;
                students.remove(student);
            }
            }
            if (HaveNumber=false) {
                System.out.println("Студента с таким ID нет");    
        }
    }
}
