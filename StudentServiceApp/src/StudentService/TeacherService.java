package StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

public class TeacherService implements iUserService<Teacher>{
    private int count;
    private List<Teacher> teachers;


    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        System.out.println("Введите уч. степень");
        Scanner sc = new Scanner(System.in);
        String degree = sc.nextLine();
        Teacher human = new Teacher(firstName, secondName, age, count, degree);
        count++;
        teachers.add(human);
    }

    public List<Teacher> getSortedByFIOStudentGroup(int num){
        List<Teacher> tcrs = new ArrayList<>(teachers);
        tcrs.sort(new UserComparator<Teacher>());
        return tcrs;
    }
        

    
}
