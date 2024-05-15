package Session03_Homeworks;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số dòng và số cột của ma trận
        System.out.print("Nhập số dòng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        // Khởi tạo ma trận
        int[][] matrix = new int[rows][cols];

        // Nhập giá trị cho các phần tử trong ma trận
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        // Tìm phần tử lớn nhất và tọa độ của nó
        int maxValue = matrix[0][0];
        int maxRow = 0, maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        // In ra ma trận
        System.out.println("\nMa trận:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        // Hiển thị giá trị lớn nhất và tọa độ của nó
        System.out.println("\n Phần tử lớn nhất trong ma trận là " + maxValue + " ở tọa độ [" + maxRow + "][" + maxCol + "]");

        scanner.close();
    }
}
