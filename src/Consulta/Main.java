package Consulta;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GradeResult> grades = GradeQuery.getGradesByCourse(123);

        for (GradeResult grade : grades) {
            System.out.println("ID Nota: " + grade.getGradeId() +
                    ", ID Estudiante: " + grade.getStudentId() +
                    ", Tipo de Nota: " + grade.getGradeType() +
                    ", Nota: " + grade.getGrade() +
                    ", Peso: " + grade.getWeight());
        }
    }
}