class Student {
    String name;
    int id;
    String course;

    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Course: " + course);
    }


    public static void main(String[] args) {
        Student student1 = new Student("John", 101, "Computer Science");
        student1.displayStudentInfo();
    }
}