import java.util.InputMismatchException;
import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
//        Đề bài: Viết một chương trình Java để tính tổng của một mảng số nguyên.
//        Nếu một phần tử trong mảng không phải số nguyên, chương trình sẽ hiển thị thông báo lỗi và bỏ qua phần tử đó.
//        Hướng dẫn làm bài: Duyệt mảng cộng các phần tử bình thường, nhưng biểu thức tính cộng để trong khối try-catch.

        Scanner scanner = new Scanner(System.in);
        int n;
        int [] arr ;
        System.out.print("Nhập số phần tử trong mảng : ");
        n = Integer.parseInt(scanner.nextLine());
        arr = new int[n];
        int sum = 0;

        for (int i : arr) {


            try {
                System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
                arr[i] = Integer.parseInt((scanner.nextLine()));



            }
            catch (NumberFormatException e) {
                System.out.println(" Lỗi không phải số nguyên. đã bỏ qua.");


            }
            for (int num : arr){
                sum += num;
            }

        }

        System.out.printf("Tổng là : "+ sum) ;

    }
}
