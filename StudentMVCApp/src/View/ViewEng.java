package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

    public class ViewEng implements iGetView {
        public void printAllStudent(List<Student> studentsInEng)
        {
            System.out.println("-----students list output-----");
            for(Student EngPerson :studentsInEng)
            {
                System.out.println(EngPerson);
            }
            System.out.println("-----end of list-----");
        }

    public String prompt(String EngMessage) {
        Scanner in = new Scanner(System.in);
        System.out.print(EngMessage);
        return in.nextLine();
    }
}
