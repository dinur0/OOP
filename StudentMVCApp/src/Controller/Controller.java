package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Student;
import Model.Model;
import View.View;
import View.ViewEng;

public class Controller {

    private List<Student> students; 
    private iGetView view;
    private iGetModel model;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    } 

    public void getAllStudent()
    {
        students = model.getAllStudent();
    }

    public boolean testData()
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void updateView()
    {
        //MVP
        getAllStudent();
        if(testData())
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }
        
        //MVC
        //view.printAllStudent(model.getAllStudent());
    }

    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudent();
                    updateView();
                    break;
                case DELETE:
                getAllStudent();
                // Long.valueOf(view.prompt("Введите команду:")).longValue();
                Long numOfDelete = Long.valueOf(view.prompt("Введите ID студента:")).longValue();
                

                
            }

        }
    }

    public void EngRun()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Choose comand:");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("exit from programm");
                    break;
                case LIST:
                    getAllStudent();
                    updateView();
                    break;
            }

        }
    }
}
