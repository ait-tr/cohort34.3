package homework.student.model;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String specialization;

    public Student(int id, String firstName, String lastName, int yearOfBirth, String specialization) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void display() {
        System.out.println("STUDENT INFORMATION"+ "ID: " + id + ", Firstname: " + firstName + ", Lastname: " + lastName +", Year of birth: "
                + yearOfBirth + ", Spezialization: " + specialization);
    }

    public void eat(){
        System.out.println("Student eating");
    }
    public void study(){
        System.out.println("Student learnt");
    }
    public void work(){
        System.out.println("Student working");
    }

    public void hierIs (){
        System.out.println("Hier is " + firstName + "  " + lastName);
    }

    public void exam (){
        System.out.println("Student is on exam phase");
    }
    public  void split(){
        System.out.println("------------------------------------------------------------------------------");
    }


}
