import java.util.Arrays;
import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        //Đề bài: Viết một chương trình Java để tìm kiếm một phần tử trong một mảng số nguyên bằng thuật
        // toán tìm kiếm nhị phân. Nếu phần tử không được tìm thấy trong mảng, chương trình sẽ hiển thị thông báo lỗi.
        //
        //Hướng dẫn làm bài:
        //- Bước 1: Khai báo biến và nhập dữ liệu
        //Khai báo một mảng số nguyên và một biến để lưu giá trị cần tìm kiếm.
        //Sử dụng Scanner để nhập giá trị cần tìm kiếm từ người dùng.
        //
        //- Bước 2: Sắp xếp mảng
        //Trước khi thực hiện tìm kiếm nhị phân, bạn cần sắp xếp mảng để đảm bảo thuật toán hoạt động đúng.
        // Sử dụng một thuật toán sắp xếp như sắp xếp nhanh (quicksort) hoặc sắp xếp trộn (merge sort) để sắp xếp mảng.
        //
        //- Bước 3: Thực hiện tìm kiếm nhị phân
        //Sử dụng thuật toán tìm kiếm nhị phân để tìm kiếm phần tử trong mảng đã sắp xếp.
        //Thuật toán tìm kiếm nhị phân chia mảng thành hai nửa và so sánh giá trị tại vị trí giữa với giá trị cần tìm kiếm. Dựa vào kết quả so sánh, tiếp tục tìm kiếm trong nửa mảng thích hợp.
        //
        //- Bước 4: Xử lý kết quả
        //Nếu phần tử được tìm thấy, in ra vị trí của nó trong mảng.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng : ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            System.out.print("Nhập giá trị cần tìm kiếm :");
            int search = scanner.nextInt();

            Arrays.sort(arr);

            int result = binarySearch(arr, search);

            if (result == -1) {
                System.out.println("Không tìm thấy giá trị trong mảng");
            } else {
                System.out.println("giá trị" + search);
            }

        }

    }

    public static int binarySearch(int[] arr, int search) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == search) {
                return mid;
            }
            if (arr[mid] > search) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;

    }
}
