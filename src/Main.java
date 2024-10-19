import controlador.CourseController;
import controlador.StudentController;
import controlador.TeacherController;
import controlador.GradeController;
import controlador.GradeTypeController;
import controlador.EnrollmentController;
import db.connection;
import modelo.Course;
import modelo.Student;
import modelo.Teacher;
import modelo.Grade;
import modelo.GradeType;
import modelo.Enrollment;
import vista.ViewCourse;
import vista.ViewStudent;
import vista.ViewTeacher;
import vista.ViewGrade;
import vista.ViewGradeType;
import vista.ViewEnrollment;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a nuestro sistema academico!");

        // Inicializar vistas
        ViewStudent viewStudent = new ViewStudent();
        ViewTeacher viewTeacher = new ViewTeacher();
        ViewCourse viewCourse = new ViewCourse();
        ViewGrade viewGrade = new ViewGrade();
        ViewGradeType viewGradeType = new ViewGradeType();
        ViewEnrollment viewEnrollment = new ViewEnrollment();

        // Inicializar controladores
        StudentController studentController = new StudentController(viewStudent);
        TeacherController teacherController = new TeacherController(viewTeacher);
        CourseController courseController = new CourseController(viewCourse);
        GradeController gradeController = new GradeController(viewGrade);
        GradeTypeController gradeTypeController = new GradeTypeController(viewGradeType);
        EnrollmentController enrollmentController = new EnrollmentController(viewEnrollment);

        // Inicializar objeto estudiante
        Student newStudent = new Student(7654, "Angelo", "angelo@gmail.com");
        Student newStudent1 = new Student(8456, "Alejandra", "alejandra@gmail.com");
        // Guardar estudiante en la base de datos
        studentController.insertNewStudent(newStudent);
        // Mostrar datos en las vistas
        studentController.displayAllStudents();

        Teacher newTeacher = new Teacher(0342, "Harold", "Filosofía");
        teacherController.insertNewTeacher(newTeacher);
        teacherController.displayAllTeachers();

        Course newCourse = new Course(9134, "Filosofía", "...", true, newTeacher.getId());
        courseController.insertNewCourse(newCourse);
        courseController.displayAllCourses();

        Grade newGrade = new Grade(5, 5678, 9876, 5.2);
        gradeController.insertNewGrade(newGrade);
        gradeController.displayAllGrades();

        GradeType newGradeType = new GradeType(2, "Taller", 0.30);
        gradeTypeController.insertNewGradeType(newGradeType);
        gradeTypeController.displayAllGradeTypes();

        Enrollment newEnrollment = new Enrollment(5678, 7654, 9134);
        enrollmentController.insertNewEnrollment(newEnrollment);
        enrollmentController.displayAllEnrollments();
    }
}