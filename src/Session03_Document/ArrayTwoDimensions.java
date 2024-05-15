package Session03_Document;

import java.util.Scanner;

public class ArrayTwoDimensions {
    public static void main(String[] args) {
        //1. Khai báo mảng 2 chiều gồm 3 dòng và 4 cột kiểu số nguyên
        int[][] numbers = new int[3][4];
        //2. Nhập giá trị các phần tử từ bàn phím
        Scanner scanner = new Scanner(System.in);
        //Duyệt các dòng trong mảng 2 chiều
        for (int i = 0; i < numbers.length; i++) {
            //Duyệt các phần tử theo cột
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("numbers[%d][%d] = ", i, j);
                numbers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //3. In các phần tử của mảng theo ma trận
        System.out.println("Các phần tử trong mảng:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%5d", numbers[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
