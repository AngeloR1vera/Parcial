package Consulta;

public class GradeResult {
    private int gradeId;
    private int studentId;
    private String gradeType;
    private double grade;
    private double weight;

    public GradeResult(int gradeId, int studentId, String gradeType, double grade, double weight) {
        this.gradeId = gradeId;
        this.studentId = studentId;
        this.gradeType = gradeType;
        this.grade = grade;
        this.weight = weight;
    }

    // Getters
    public int getGradeId() { return gradeId; }
    public int getStudentId() { return studentId; }
    public String getGradeType() { return gradeType; }
    public double getGrade() { return grade; }
    public double getWeight() { return weight; }
}