package HW66;

import java.util.Scanner;

public class baitap66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số hàng và cột
        System.out.print("Nhập số hàng: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        // Nhập ma trận A
        System.out.println("Nhập ma trận A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Nhập ma trận B
        System.out.println("Nhập ma trận B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Cộng hai ma trận
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // In kết quả
        System.out.println("Ma trận tổng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}