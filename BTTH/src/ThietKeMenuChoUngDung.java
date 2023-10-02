import java.util.Scanner;

public class ThietKeMenuChoUngDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Vẽ tam giác");
            System.out.println("2. Vẽ hình vuông");
            System.out.println("3. Vẽ hình chữ nhật");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    System.out.println("*****");
                    break;

                case 2:
                    System.out.println("* * * * *");
                    System.out.println("*       *");
                    System.out.println("*       *");
                    System.out.println("*       *");
                    System.out.println("* * * * *");
                    break;
                case 3:
                    System.out.println("*****");
                    System.out.println("*   *");
                    System.out.println("*   *");
                    System.out.println("*   *");
                    System.out.println("*****");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No Choice !");
                    break;
            }
            break;
        }
    }
}
