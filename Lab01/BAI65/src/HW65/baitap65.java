package HW65;

import java.util.Arrays;
import java.util.Scanner;

public class baitap65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử
        System.out.print("Nhap so phan tu: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Nhập mảng
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // In mảng ban đầu
        System.out.println("Mang ban dau: " + Arrays.toString(arr));

        // Sắp xếp mảng
        Arrays.sort(arr);

        // In mảng sau khi sắp xếp
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));

        // Tính tổng
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Tính trung bình
        double average = (double) sum / n;

        // In kết quả
        System.out.println("Tong: " + sum);
        System.out.println("Trung binh: " + average);

        scanner.close();
    }
}