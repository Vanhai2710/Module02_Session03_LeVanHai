package Session03_Document;

import java.util.Scanner;

public class ArrayOneDimension {
    public static void main(String[] args) {
        /*
         * Syntax:
         * Datatype[] arrayName = new Datatype[size]
         * Truy cập từng phần tử: arrName[index]
         * Khởi tạo giá trị cho phần tử:
         * */

        //1.1 Khai báo mảng số nguyên gồm 5 phần tử
        int[] numbers = new int[5];//chỉ số cao nhất của phần tử là 4
        //1.2. In ra giá trị các phần tử trong mảng
        System.out.println("Các phần tử sau khi khai báo mảng:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d\t", numbers[i]);
        }
        System.out.printf("\n");
        //1.3. Khởi tạo giá trị cho các phần tử lần lượt là 1,2,3,4,5
        //Khởi tạo giá trị phần tử đầu tiên
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        //1.4. In các phần tử trong mảng sau khi khởi tạo giá trị cho từng phần tử
        System.out.println("Các phần tử sau khi khởi tạo giá trị từng phần tử:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d\t", numbers[i]);
        }
        System.out.printf("\n");
        //1.5. Tính tổng các phần tử trong mảng
        int sumNumbers = 0;
        //- Duyệt từng phần tử trong mảng - fori
        for (int i = 0; i < numbers.length; i++) {
            //- Tính tổng các phần tử
            sumNumbers += numbers[i];
        }
        System.out.println("Tổng các phần tử trong mảng là: " + sumNumbers);
        //2.1 Khai báo mảng chuỗi chứa tên sinh viên gồm 3 phần tử
        String[] arrStudentNames = new String[3];//chỉ số cao nhất 2
        //2.2 In ra giá trị các phần tử trong mảng
        System.out.println("Các phần tử trong mảng tên sinh viên sau khi khai báo");
        for (int i = 0; i < arrStudentNames.length; i++) {
            System.out.printf("%s\t", arrStudentNames[i]);
        }
        System.out.printf("\n");
        //2.3. Nhập giá trị các phần tử từ của mảng tên sinh vien từ bàn phím
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrStudentNames.length; i++) {
            System.out.printf("Nhập vào tên sinh viên thứ %d: ", (i + 1));
            arrStudentNames[i] = scanner.nextLine();
        }
        //2.4. In ra giá trị các phần tử trong mảng tên sinh viên
        System.out.println("Tên các sinh viên trong mảng là:");
        for (int i = 0; i < arrStudentNames.length; i++) {
            System.out.println(arrStudentNames[i]);
        }
    }
}
