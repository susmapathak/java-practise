public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public Student(String fName, String lName, int age){
        this.firstName= fName;
        this.lastName = lName;
        this.age= age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }


}
