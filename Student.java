public class Student {
    int id;
    String name;
    String email;
    String course;

    public Student(int id, String name, String email, String course) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Email: " + email + ", Course: " + course;
    }
}

