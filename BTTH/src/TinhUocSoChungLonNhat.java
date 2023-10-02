import java.util.Scanner;

public class TinhUocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        int a = sc.nextInt();
//        a = Math.abs(a);
        System.out.println("Nhập vào số b:");
        int b = sc.nextInt();
//        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println(" Không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
                System.out.println("Ước lớn nhất là: " + a);
                break;
            } else {
                b = b - a;
                System.out.println(" Ước lớn nhất là: " + b);
                break;
            }
        }
//        System.out.println("Ước lớn nhất là: " + a);
    }
}
