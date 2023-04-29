package StudentDomen;

import java.util.List;

import StudentService.iForAges;

public class AverageAge<T extends iForAges>{
    private List<T> humansList;

public AverageAge(List<T> humansList){
    this.humansList = humansList;
}

    public double getAges() {
        double agesum = 0.0;
        for (T human : humansList) {
            agesum+=human.getAge();
        }
        return agesum/humansList.size();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
