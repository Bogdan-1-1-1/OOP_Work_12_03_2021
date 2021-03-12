package firstTask;

public class Student { //пункт 1
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student() {
        this.firstName = "Nick";
        this.lastName = "Miller";
        this.group = "informatics";
        this.averageMark = Math.random()*6;
    }

    String getScholarship() { //пункт 3 (ч. 1)
        if(averageMark >= 5) {
            return "100$";
        } else return  "80$";
    }
}
