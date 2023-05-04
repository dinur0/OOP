package Controller;

import java.util.HashMap;
import java.util.List;
import Model.Student;

public interface iGetModel {
    public List<Student> getAllStudent();
    public void DeleteStudent(long StudID);
}
