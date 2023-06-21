package Bai2;

import java.util.List;

public abstract class Student {

    private String fullName;
    private int born;
    private float score;
    private double ID;

    public Student(String fullName, int born, float score, double ID) {
        this.fullName = fullName;
        this.born = born;
        this.score = score;
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public abstract void inPut();

    public abstract void inSert(List<? super MethodImplementation> students);

    public abstract void disPlay(List<? super MethodImplementation> students);

    public abstract void search(List<? super MethodImplementation> students, String name);

    public abstract void upDate(List<? super MethodImplementation> students, String name);

    public abstract void reMove(List<? super MethodImplementation> students, String name);

}
