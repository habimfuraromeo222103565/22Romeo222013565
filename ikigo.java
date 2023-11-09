public class ikigo {
    public static void main(String[] args) {
        Student student1 = new Student("John", 16);
        Student student2 = new Student("Alice", 17);

        Teacher teacher = new Teacher("Mr. Smith", "Math");

        Course mathCourse = new Course("Mathematics", teacher);

        student1.enroll(mathCourse);
        student2.enroll(mathCourse);

        student1.introduce();
        student2.introduce();
        teacher.teach();
        mathCourse.displayInfo();
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int age;
    Course enrolledCourse;

    public Student(String name, int age) {
        super(name);
        this.age = age;
    }

    void introduce() {
        System.out.println("I am a student named " + name + " and I am " + age + " years old.");
    }

    void enroll(Course course) {
        enrolledCourse = course;
        System.out.println(name + " has enrolled in the course: " + course.courseName);
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    void teach() {
        System.out.println("I am a teacher named " + name + " and I teach " + subject + ".");
    }
}

class Course {
    String courseName;
    Teacher teacher;

    public Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
    }

    void displayInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Teacher: " + teacher.name);
    }
}
