package classes.score;

public class Student {
    private int studentId;
    private String studentName;
    Subject korean;
    Subject math;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        korean = new Subject();
        math = new Subject();
    }

    public void setKoreanSubject(String name, int score) {
        korean.setSubjectName(name);
        korean.setScorePoint(score);
    }

    public void setMathSubject(String name, int score) {
        math.setSubjectName(name);
        math.setScorePoint(score);
    }

    public void showInfo() {
        System.out.println(
                "학번: " + studentId +
                        "\n이름: " + studentName +
                        "\n국어 점수: " + korean.getScorePoint() +
                        "\n수학 점수: " + math.getScorePoint());
    }
}
