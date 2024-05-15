package Session03_Document;

import java.util.Scanner;

public class ArrayTwoDimensions_UD {
    public static void main(String[] args) {
        /*
        * Nhập số dòng(row) và số cột(col) của mảng 2 chiều
        * Khai báo mảng 2 chiều số nguyên gồm row dòng và col cột
        * In menu và thực hiện các chức năng theo menu sau:
        * *****************MENU*******************
        * 1. Nhập giá trị các phần tử của mảng
        * 2. Hiển thị các phần tử mảng theo ma trận
        * 3. Tính tổng các phần tử có giá trị chẵn trong mảng
        * 4. In ra các phần tử chia hết cho 3 và 5
        * 5. Thoát
        * */

        Scanner scanner = new Scanner(System.in);

        // Nhập số dòng và số cột của mảng 2 chiều
        System.out.print("Nhập số dòng của mảng: ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int col = scanner.nextInt();

        // Khai báo mảng 2 chiều số nguyên gồm row dòng và col cột
        int[][] arr = new int[row][col];

        var choice = 0;
        do {
            // In menu
            System.out.println("*****************MENU*******************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. Hiển thị các phần tử mảng theo ma trận");
            System.out.println("3. Tính tổng các phần tử có giá trị chẵn trong mảng");
            System.out.println("4. In ra các phần tử chia hết cho 3 và 5");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Nhập giá trị các phần tử của mảng
                    System.out.println("Nhập giá trị các phần tử của mảng:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.print("arr[" + i + "][" + j + "] = ");
                            arr[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    // Hiển thị các phần tử mảng theo ma trận
                    System.out.println("Các phần tử mảng theo ma trận:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    // Tính tổng các phần tử có giá trị chẵn trong mảng
                    int evenSum = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (arr[i][j] % 2 == 0) {
                                evenSum += arr[i][j];
                            }
                        }
                    }
                    System.out.println("Tổng các phần tử có giá trị chẵn trong mảng: " + evenSum);
                    break;
                case 4:
                    // In ra các phần tử chia hết cho 3 và 5
                    System.out.println("Các phần tử chia hết cho 3 và 5:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (arr[i][j] % 3 == 0 && arr[i][j] % 5 == 0) {
                                System.out.print(arr[i][j] + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
