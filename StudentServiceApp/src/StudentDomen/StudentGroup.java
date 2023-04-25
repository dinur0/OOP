package StudentDomen;
/**
 * импорт репозиториев
 */
import java.util.Iterator;
import java.util.List;
/**
 * объявление класса, добавление итерируемости и метода для сравнения объектов
 */
public class StudentGroup implements Iterable<Student>,Comparable<StudentGroup> {
    private List<Student> students;
/**
* конструктор класса
*/
    public StudentGroup(List<Student> students) {
        this.students = students;
    }
/**
 * геттер набора студентов
 */
    public List<Student> getStudents() {
        return students;
    }
/**
 * сеттер набора студентов
 */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
/**
 * переопределение ToString для вывода информации о студентах
 */
    @Override
    public String toString() {
        return "Group"+students;
    }
/**
 *итератор для перебора групп студентов
 */
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return students.get(index++);        
            }

        };
    }
/**
 *условия для сравнения групп по кол-ву
 */
    @Override
    public int compareTo(StudentGroup o) {
        
         if(this.students.size()==o.students.size())
         {
        return 0;
         } 
         if(this.students.size()<o.students.size())
         {
            return -1;
         }   
         return 1;
    }
    
}
