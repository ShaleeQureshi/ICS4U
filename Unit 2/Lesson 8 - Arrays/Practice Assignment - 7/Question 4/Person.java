public class Person {

    private String firstName, lastName, phoneNumber;
    private int age, grade;

    public Person(String firstName, String lastName, int age, String phoneNumber, int grade) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.grade = grade;
    }

    public void changeGrade(int grade) {
        this.grade = grade;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getGrade() {
        return this.grade;
    }

}
