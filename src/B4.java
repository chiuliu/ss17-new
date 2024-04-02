import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
//        Đề bài: Viết một chương trình Java để chuyển đổi một chuỗi thành số nguyên. Nếu chuỗi không phải số nguyên, chương trình sẽ thay thế những kí tự không phải số thành 0.
//        Hướng dẫn :
//        -	B1: Tạo 1 biến string, lấy dữ liệu từ bàn phím.
//                -	B2: Tạo 1 List số nguyên.
//                -	B3: duyệt chuỗi đó, trong vòng lặp ép kiểu từng phần tử về Integer, đặt trong khối Try -Catch, nếu vào catch thì add số 0 vào list và thông báo có 1 ký tự không phải số nguyên được thay thế = 0.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();
        List<Integer> integerList = new ArrayList<>();


        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            try {

                int num = Integer.parseInt(String.valueOf(c));
                integerList.add(num);
            } catch (NumberFormatException e) {
                integerList.add(0);
                System.out.println("Ký tự không phải số nguyên được thay thế bằng số 0.");
            }
        }
        System.out.print("Danh sách số nguyên: ");
        for (int num : integerList) {
            System.out.print(num + " ");
        }
    }


}

