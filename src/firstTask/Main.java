package firstTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Student aspirant = new Aspirant(); //пункт 2

        ////////////////////////////////////////////////////////
        ArrayList<Student> studentList = new ArrayList<>(); // пункт 4
        for (int i = 0; i < 50; i++) {
            studentList.add(new Student());
            studentList.add(new Aspirant());
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(studentList.get(i).getScholarship());
        }

    }
}
