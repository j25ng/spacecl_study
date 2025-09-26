package classes.score;

public class Main {
    public static void main(String[] args) {
        Student woo = new Student(1001, "우영우");

        woo.setKoreanSubject("국어", 90);
        woo.setMathSubject("수학", 80);

        woo.showInfo();
    }
}
