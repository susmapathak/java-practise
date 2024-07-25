public class Teacher {
    private String teacherName;
    private String subject;
    private int salary;

    public Teacher(String tName, String subj, int salary){
        this.teacherName = tName;
        this.subject = subj;
        this.salary = salary;
    }

    public String getTeacherName(){
        return teacherName;
    }

    public String getSubject(){
        return subject;
    }

    public int getSalary(){
        return salary;
    }

}
