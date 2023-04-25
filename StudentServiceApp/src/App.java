import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;


public class App {
    public static void main(String[] args) throws Exception {
        /**
         * создание студентов
         */
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);
        /**
         * создание списков студентов
         */
        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s4);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s5);
        listStud3.add(s6);
        /**
         * формирование групп из списков
         */
        StudentGroup group1 = new StudentGroup(listStud);
        StudentGroup group2 = new StudentGroup(listStud2);
        StudentGroup group3 = new StudentGroup(listStud3);
        /**
         * создание потока и его номера
         */
        List<StudentGroup> groupList = new ArrayList<StudentGroup>();
        groupList.add(group1);
        groupList.add(group2);
        groupList.add(group3);
        StudentSteam newSteam = new StudentSteam(groupList,345);
        /**
         * вывод групп без сортировки
         */
        for(StudentGroup iGroup : newSteam)
        {
            System.out.println(iGroup);
            System.out.println(newSteam.getNumberOfSteam());
        }
        Collections.sort(newSteam.getSteam());
        System.out.println("--------------after sorting--------------------");
        /**
         * вывод групп после сортировки
         */
        for(StudentGroup iGroup : newSteam)
        {
            System.out.println(iGroup);
            System.out.println(newSteam.getNumberOfSteam());
        }


    }
}
