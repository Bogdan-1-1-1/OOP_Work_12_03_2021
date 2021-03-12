package firstTask;

public class Aspirant extends Student{

    String scienceWork;

    public Aspirant() {
        super();
        this.scienceWork = "Blockchain";
    }

    @Override
    String getScholarship() { // пункт 3 (ч. 2)
        if(averageMark >= 5) {
            return "200$";
        } else return  "180$";
    }
}
