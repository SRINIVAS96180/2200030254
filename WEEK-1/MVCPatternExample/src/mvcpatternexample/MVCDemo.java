package mvcpatternexample;

public class MVCDemo {
    public static void main(String[] args) {
        Student student = new Student("Arjun", "S123", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Arjun Sharma");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}