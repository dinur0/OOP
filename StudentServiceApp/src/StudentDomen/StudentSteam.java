package StudentDomen;
/**
 * импорт репозиториев
 */
import java.util.Iterator;
import java.util.List;

/**
 * объявление класса, добавление итерируемости
 */
public class StudentSteam implements Iterable<StudentGroup>{
    /**
     * @numberOfSteam номер потока
     * @steam лист с группами
     */
    private int numberOfSteam;
    private List<StudentGroup> steam;
/**
* конструктор класса
*/
    public StudentSteam (List<StudentGroup>steam, int numberOfSteam){
        this.steam = steam;
        this.numberOfSteam = numberOfSteam;
    }
/**
 * геттер номера потока
 */
    public int getNumberOfSteam() {
        return numberOfSteam;
    }
/**
 * геттер листа с группами
 */
    public List<StudentGroup> getSteam() {
        return steam;
    }
/**
 *итератор для перебора групп в @steam
 */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<steam.size();
            }
            @Override
            public StudentGroup next() {
                if(!hasNext())
                {
                    return null;
                }
                return steam.get(index++);        
            }
        };
    }
    
}
