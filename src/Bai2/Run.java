package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<MethodImplementation> arrayList = new ArrayList<MethodImplementation>();
        MethodImplementation methodImplementation = new MethodImplementation();
        methodImplementation.inPut();
        methodImplementation.inSert(arrayList);
        methodImplementation.disPlay(arrayList);

        System.out.println("Nhap ho ten can tim kiem:");
        String name = scanner.nextLine();
        methodImplementation.search(arrayList, name);

        System.out.println("Nhap ho ten can sua:");
        String name1 = scanner.nextLine();
        methodImplementation.upDate(arrayList, name1);
        System.out.println("Danh sach sau khi sua:");
        methodImplementation.disPlay(arrayList);

        System.out.println("Nhap ho ten can xoa:");
        String name2 = scanner.nextLine();
        methodImplementation.reMove(arrayList, name2);
        System.out.println("Danh sach sau khi xoa:");
        methodImplementation.disPlay(arrayList);

    }

}
