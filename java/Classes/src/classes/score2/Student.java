package classes.score2;

import classes.score.Subject;

public class Student {
    private int studentId;
    private String studentName;
    private Subject[] subjects; // Subject[] subjects = new Subject[2];

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        subjects = new Subject[10];
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setScorePoint(score);

        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) {
                subjects[i] = subject;
                break;
            }
        }

    }

    public void showInfo() {
        System.out.println(
                "학번: " + studentId +
                        "\n이름: " + studentName);

        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null) {
                System.out.println(subjects[i].getSubjectName() + " 점수: " + subjects[i].getScorePoint());
            }
        }
        System.out.println("-------------------");
    }
}