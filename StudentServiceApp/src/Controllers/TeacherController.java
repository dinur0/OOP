package Controllers;

import StudentDomen.Teacher;
import StudentDomen.User;
import StudentService.TeacherService;

public class TeacherController implements iUserController<Teacher>{
    private final TeacherService teachersData = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        teachersData.create(firstName, secondName, age);
    }
    
    static public <T extends Teacher> void paySalary(T human)
    {
        System.out.println(((User) human).getFirstName()+" зп 15000р ");
    }

    static public <T extends Number> Double mean(T[] num)
    {
        double sum = 0.0;
        for(int i =0; i<num.length;i++)
        {
            sum= sum+num[i].doubleValue();
        }
        sum=sum/num.length;
        return sum;
    }
}
