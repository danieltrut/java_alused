package week10.ex29;

import java.util.List;
import java.util.ArrayList;
import week10.ex29.people.Person;
import week10.ex29.people.Teacher;
import week10.ex29.people.Student;




public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

        printDepartment(people);

    }

    public static void printDepartment(List<Person> people) {
        // we print all the people in the department
        for(Person temp : people){
            System.out.println(temp);
        }
    }
}
