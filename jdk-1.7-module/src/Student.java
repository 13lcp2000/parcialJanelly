package parcialDiego;

public class Student {

    private double note1 = 0.0;
    private double note2 = 0.0;
    private double note3 = 0.0;
    private double finalRating = 0.0;

    public Student() {
    }

    public Student(double note1, double note2, double note3) {

        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.finalRating = toCalculateFinalRating();
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    public void setNote3(double note3) {
        this.note3 = note3;
    }

    public double getNote1() {
        return note1;
    }

    public double getNote2() {
        return note2;
    }

    public double getNote3() {
        return note3;
    }

    public double toCalculateFinalRating() {
        return ((note1 + note2 + note3) / 3);
    }

    @Override
    public String toString() {
        return "The ratings of the students are: \n"
                + "note1=" + note1
                + ",\n note2=" + note2
                + ",\n note3=" + note3
                + ",\n Final Rating=" + finalRating;
    }

}
