package week5;
import java.util.ArrayList;
import java.util.Scanner;

public class Main88 {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        Scanner reader = new Scanner(System.in);
        while (true){
            System.out.print("name: ");
            String name = reader.nextLine();
            if(name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            students.add(new Student(name, studentNumber));
        }

        for (Student student: students
        ) {
            System.out.println(student);
        }
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");
        for (Student student: students
        ) {
            if(student.getName().contains(search)){
                System.out.println(student);
            }
        }
    }
}