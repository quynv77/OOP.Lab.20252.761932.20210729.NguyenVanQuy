package HW63;

import java.util.Scanner;

public class baitap63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 📥 Nhập n
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // 🔁 In tam giác
        for (int i = 1; i <= n; i++) {

            // ⬜ In khoảng trắng (căn giữa)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // ⭐ In dấu *
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // ⏎ Xuống dòng
            System.out.println();
        }
    }
}