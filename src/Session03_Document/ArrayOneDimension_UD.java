package Session03_Document;

import java.util.Scanner;

public class ArrayOneDimension_UD {
    public static void main(String[] args) {
        /*
         * Khai báo mảng 1 chiều số nguyên gồm 6 phần tử
         * In menu và thực hiện các chức năng theo menu
         * ***************MENU******************
         * 1. Nhập giá trị cho các phần tử trong mảng
         * 2. In ra gía trị các phần tử của mảng
         * 3. Tính tổng các phần tử
         * 4. In ra các phần tử có giá trị chẵn
         * 5. In ra các phần tử có chỉ số lẻ
         * 6. Thoát
         */

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6]; // khai báo mảng 1 chiều số nguyên gồm 6 phần tử

        int choice = 0;
        do {
            // In menu
            System.out.println("****************MENU***************");
            System.out.println("1. Nhập giá trị cho các phần tử trong mảng");
            System.out.println("2. In ra giá trị các phần tử của mảng");
            System.out.println("3. Tính tổng các phần tử");
            System.out.println("4. In ra các phần tử có giá trị chẵn");
            System.out.println("5. In ra các phần tử có chỉ số lẻ");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Nhập giá trị cho các phần tử trong mảng
                    System.out.println("nhập giá trị cho các phần tử trong mảng: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("arr[" + i + "] = ");
                        arr[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    // In ra giá trị các phần tử của mảng
                    System.out.println("Giá trị các phần tử của mảng: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    // Tính tổng các phần tử
                    int sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Tổng các phần tử: " + sum);
                    break;
                case 4:
                    // In ra các phần tử có giá trị chẵn
                    System.out.println("Các phần tử có giá trị chẵn:");
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 == 0) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    // In ra các phần tử có chỉ số lẻ
                    System.out.println("Các phần tử có chỉ số lẻ:");
                    for (int i = 0; i < arr.length; i++) {
                        if (i % 2 != 0) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
