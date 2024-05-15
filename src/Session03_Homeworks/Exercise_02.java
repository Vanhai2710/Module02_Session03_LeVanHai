package Session03_Homeworks;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo mảng với các phần tử đã có sẵn giá trị ban đầu
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0}; // Chú ý thêm 10 phần tử để đủ chỗ dịch chuyển

        // Hiển thị mảng ban đầu
        System.out.println("Mảng ban đầu: " + arrayToString(array));

        // Nhập giá trị cần chèn
        System.out.print("Nhập giá trị cần chèn: ");
        int value = scanner.nextInt();

        // Nhập vị trí cần chèn
        System.out.print("Nhập vị trí cần chèn (0-9): ");
        int position = scanner.nextInt();

        // Kiểm tra vị trí hợp lệ
        if (position < 0 || position >= array.length) {
            System.out.println("Vị trí không hợp lệ! Vui lòng nhập vị trí từ 0 đến 9.");
        } else {
            // Dịch các phần tử từ vị trí chèn trở đi sang phải
            for (int i = array.length - 1; i > position; i--) {
                array[i] = array[i - 1];
            }

            // Chèn giá trị vào vị trí đã chỉ định
            array[position] = value;

            // In mảng sau khi chèn
            System.out.println("Mảng sau khi chèn: " + arrayToString(array));
        }

        scanner.close();
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
