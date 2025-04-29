class Student {
    String name;
    int id;
    String course;
    String phoneNumber;
    String address;

    public Student(String name, int id, String course, String phoneNumber, String address) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Course: " + course);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 101, "Computer Science", "123-456-7890", "123 Main St, City");
        student1.displayStudentInfo();
    }
}