package Session03_Homeworks;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng
        int[] arr = new int[n];

        // nhập giá trị cho các phần tử trong mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Tìm giá trị nhỏ nhất trong mảng
        int minValue = arr[0]; // giả sử phần tử đầu tiên là giá trị nhở nhất ban đầu
        for (int i = 1; i < n; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        // Hiển thị mảng và giá trị nhở nhất
        System.out.print("Mảng: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\n=>  Giá trị nhỏ nhất trong mảng là: " + minValue);

        scanner.close();
    }
}
