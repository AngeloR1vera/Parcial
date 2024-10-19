package Consulta;

import db.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GradeQuery {

    public static List<GradeResult> getGradesByCourse(int courseId) {
        var grades = new ArrayList<GradeResult>();
        var sql = """
                  SELECT g.id AS grade_id, e.student_id, gt.name AS grade_type, g.grade, gt.weight
                  FROM grades g
                  JOIN enrollment e ON g.enrollment_id = e.id
                  JOIN grade_type gt ON g.grade_type_id = gt.id
                  WHERE e.course_id = ?
                  """;

        try (Connection con = connection.getConnection();
             PreparedStatement statement = con.prepareStatement(sql)) {

            statement.setInt(1, courseId);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                var gradeResult = new GradeResult(
                        rs.getInt("grade_id"),     // ID de la calificación
                        rs.getInt("student_id"),   // ID del estudiante
                        rs.getString("grade_type"), // Tipo de calificación (examen, tarea, etc.)
                        rs.getDouble("grade"),     // Valor de la calificación
                        rs.getDouble("weight")     // Peso del tipo de calificación
                );
                grades.add(gradeResult);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return grades;
    }
}