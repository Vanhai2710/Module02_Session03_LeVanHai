package Session03_Homeworks;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng thứ nhất
        System.out.print("Nhập kich thước của mảng thứ nhất: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        // Nhập các phần tử của mảng thứ nhất
        System.out.println("Nhập các phần tử của mảng thứ nhất: ");
        for (int i = 0; i < size1; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Nhập kích thước của mảng thứ 2
        System.out.print("Nhập kích thước của mảng thứ 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        // Nhập các phần tử của mảng thứ 2
        System.out.println("Nhập các phần tử của mảng thứ 2: ");
        for (int i = 0; i < size2; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Khai báo mảng thứ ba có kích thước bằng tổng kích thước của hai mảng ban đầu
        int[] mergedArray = new int[size1 + size2];

        // Sao chép các phần tử của mảng thứ nhất vào mảng thứ ba
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }

        // Sao chép các phần tử của mảng thứ hai vào mảng thứ ba
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }

        // In mảng sau khi gộp
        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        scanner.close();
    }
}
