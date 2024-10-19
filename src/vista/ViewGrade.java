package vista;

import interfaces.IMostrarMensaje;
import modelo.Grade;

import java.util.List;

public class ViewGrade implements IMostrarMensaje {
    public void displayListGrades(List<Grade> grades) {
        System.out.println(" == Lista de Grados == ");
        for (Grade grade : grades) {
            System.out.println("Id Grado: " + grade.getId() + ", Inscripción ID: " + grade.getEnrollmentId() + ", Tipo de Grado ID: " + grade.getGradeTypeId() + ", Grado: " +grade.getGrade());
        }
    }
}