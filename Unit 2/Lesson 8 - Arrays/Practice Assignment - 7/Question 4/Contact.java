public class Contact {

    private Person[] contact;
    private int currentIndex = 0;
    private final int MAX;

    public Contact() {
        this.contact = new Person[100];
        this.MAX = 100;
    }

    public Contact(int num) {
        this.contact = new Person[num];
        this.MAX = num;
    }

    public void addPerson(String firstName, String lastName, int age, String phoneNumber, int grade) {
        if (this.currentIndex < this.MAX) {
            this.contact[this.currentIndex] = new Person(firstName, lastName, age, phoneNumber, grade);
            this.currentIndex++;
        } else {
            System.out.println("Contact List is full!");
        }
    }

    public void removePerson(int personIndex) {
        // Loop to iterate through the contact list
        for (int i = personIndex; i < this.currentIndex - 1; i++) {
            this.contact[i] = this.contact[i + 1];
        } // for loop

        this.contact[this.currentIndex - 1] = null;
        this.currentIndex--;
    }

    public void displayBook() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(this.contact[i].getFirstName() + "\t" + this.contact[i].getLastName() + "\t"
                    + this.contact[i].getAge() + "\t" + this.contact[i].getPhoneNumber() + "\t"
                    + this.contact[i].getGrade());
        }
    }

    public void changeGrade(int personIndex, int newGrade) {
        this.contact[personIndex].changeGrade(newGrade);
    }

}