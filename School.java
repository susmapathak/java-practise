import java.util.ArrayList;

public class School {
    private String name;
    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Teacher> teachers = new ArrayList<>();
    public ArrayList<String> classes;


    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(String stname){
    }

    public void addTeacher(Teacher tname){
        teachers.add(tname);
    }

    public School(String sname){
       name = sname;
    }

    public String getName(){
        return name;
    }

    public void printDetails(){
        // System.out.println(name + "\n-----------------------\n--------Students---------");
        // for (Student student : students) {
        //     System.out.println(student.getFirstName() +" " + student.getLastName() + " - " + student.getAge());
        // }
    }

    public ArrayList<Student> findStudentByFirstName(String fName){
        ArrayList<Student> matchingStudents = new ArrayList<>();

        for (Student fstudent : students) {
            if(fstudent.getFirstName().equals(fName)){
                matchingStudents.add(fstudent);
            }
        }
        return matchingStudents;
    }

}
