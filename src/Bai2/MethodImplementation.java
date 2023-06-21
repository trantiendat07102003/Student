package Bai2;

import java.util.List;
import java.util.Scanner;

public class MethodImplementation extends Student {

    public MethodImplementation(String fullName, int born, float score, double ID) {
        super(fullName, born, score, ID);
    }

    public MethodImplementation() {
        super(null, 0, 0, 0);
    }

    @Override
    public void inPut() {

        String fullName;
        int born;
        float score;
        double ID;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho va ten:");
        fullName = scanner.nextLine();
        this.setFullName(fullName);
        if (this.getFullName().equals("")) {
            return;
        }
        System.out.println("Nhap nam sinh:");
        born = scanner.nextInt();
        this.setBorn(born);
        System.out.println("Nhap diem:");
        score = scanner.nextFloat();
        this.setScore(score);
        System.out.println("Nhap ma so:");
        ID = scanner.nextDouble();
        this.setID(ID);

    }

    @Override
    public void inSert(List<? super MethodImplementation> students) {

        for (int i = 0;; i++) {
            if (this.getFullName().equals("")) {
                return;
            } else {
                MethodImplementation methodImplementation = new MethodImplementation();
                methodImplementation.inPut();
            }
        }

    }

    @Override
    public void disPlay(List<? super MethodImplementation> students) {

        for (int i = 0; i < students.size(); i++) {
            System.out.printf("[Ho Ten: %s | Nam Sinh: %d | Diem: %.2f | Ma So: %l]",
                    this.getFullName(), this.getBorn(), this.getScore(), this.getID());
        }

    }

    @Override
    public void search(List<? super MethodImplementation> students, String name) {

        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (this.getFullName().equals(name)) {
                System.out.printf("[Ho Ten: %s | Nam Sinh: %d | Diem: %.2f | Ma So: %l]",
                        this.getFullName(), this.getBorn(), this.getScore(), this.getID());
                check = true;
            }
        }
        if ( check = false) {
            System.out.println("Khong tim thay du lieu");
        }

    }

    @Override
    public void upDate(List<? super MethodImplementation> students, String name) {
        
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (this.getFullName().equals(name)) {
                MethodImplementation methodImplementation = new MethodImplementation();
                methodImplementation.inPut();
                students.set(i, methodImplementation);
                check = true;
            }
        }
        if (check = false) {
            System.out.println("Khong tim thay du lieu can sua");
        }
        
    }

    @Override
    public void reMove(List<? super MethodImplementation> students, String name) {
        
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (this.getFullName().equals(name)) {
                students.remove(i);
                check = true;
            }
        }
        if (check = false) {
            System.out.println("Khong tim thay du lieu can xoa");
        }
            
    }

}
