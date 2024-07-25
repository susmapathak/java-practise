
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        School school1 = new School("John Palmers");

        Student std1 = new Student("Susma", "pathak", 28);
        school1.addStudent(std1);


        Student std2 = new Student("Susma", "pa", 29);
        school1.addStudent(std2);

        Teacher teacher1 = new Teacher("madan", "Math", 100000);
        school1.addTeacher(teacher1);


        ArrayList<Student> students = school1.findStudentByFirstName("Susma");
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());

        }

        school1.printDetails();
    }
}
