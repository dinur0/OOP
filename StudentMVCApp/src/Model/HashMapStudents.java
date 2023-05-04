package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.iGetModel;

public class HashMapStudents implements iGetModel {
    HashMap<Long,Student> mapList;

    public HashMapStudents(HashMap<Long,Student> mapList){
        this.mapList = mapList;
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student> values = new ArrayList<Student>(mapList.values());
        return values;
    }
    @Override
    public void DeleteStudent(long StudID){
        boolean HaveNumber = false;
        for (Map.Entry<Long,Student> student : mapList.entrySet()) {
        if (student.getValue().getStudentID() == StudID){
            HaveNumber = true;
            mapList.remove(student.getKey());
        }
    }
    if (HaveNumber=false) {
        System.out.println("Студента с таким ID нет");
    }
}
}
