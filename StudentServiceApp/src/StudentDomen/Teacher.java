package StudentDomen;

import StudentService.iForAges;

public class Teacher extends User implements iForAges{
    
    private int teacerId;
    private String academicDegree;

    public Teacher(String firstName, String secondName, int age, int teacerId, String academicDegree ) {
        super(firstName, secondName, age);
       this.teacerId = teacerId;
       this.academicDegree = academicDegree;
    }

    public int getTeacerId() {
        return teacerId;
    }

    public void setTeacerId(int teacerId) {
        this.teacerId = teacerId;
    }

    public String getLevel() {
        return academicDegree;
    }

    public void setLevel(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

}
