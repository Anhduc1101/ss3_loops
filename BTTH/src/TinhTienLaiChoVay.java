import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        System.out.println("Nhập vào số tiền muốn gửi (đơn vị: VND):");
        double tien = scanner.nextDouble();
        System.out.println("Nhập vào số tháng muốn gửi");
        int thang = scanner.nextInt();
        System.out.println("Nhập vào tỉ suất (đơn vị: %):");
        double tiSuat = scanner.nextDouble();
        double lai = 0;
        for (int i = 0; i < thang; i++) {
            lai = Math.round(tien * tiSuat / (12 * thang));
        }
        System.out.println("Lãi của bạn sau " + thang + " tháng là: " + currencyVN.format(lai));
    }
}