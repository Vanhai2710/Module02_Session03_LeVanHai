package Session03_Homeworks;

public class Exercise_01 {
    public static void main(String[] args) {
        // Khởi tạo mảng ban đầu
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int indexToRemove = 3; // Xóa phần tử tại vị trí index 3

        // In ra mảng ban đầu
        System.out.println("value:     " + arrayToString(arr));

        // Gọi phương thức xóa phần tử tại vị trí indexToRemove
        removeElement(arr, indexToRemove);

        // In ra mảng sau khi xóa
        System.out.println("new value: " + arrayToString(arr));
    }

    // Phương thức xoá phần tử tại vị trí index trong mảng arr
    public static void removeElement(int[] arr, int index) {
        // Dịch chuyển các phần tử từ vị trí index+1 về trước một vị trí
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // Gán giá trị 0 cho phần tử cuối cùng của mảng
        arr[arr.length - 1] = 0;
    }

    // Phương thức chuyển đổi mảng thành chuỗi để hiển thị
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
