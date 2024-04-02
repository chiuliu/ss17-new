import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        //Đề bài: Viết một chương trình Java để kiểm tra xem một số có phải số nguyên tố hay không. Nếu số không phải số nguyên,tố, chương trình sẽ hiển thị thông báo lỗi.
        //
        //
        //Hướng dẫn làm bài:
        //- Bước 1: Khai báo biến và nhập dữ liệu
        //Khai báo một biến để lưu số cần kiểm tra.
        //Sử dụng Scanner để nhập số từ người dùng.
        //
        //- Bước 2: Kiểm tra điều kiện số không phải số nguyên tố
        //Kiểm tra nếu số nhỏ hơn 2 (số nguyên tố là số lớn hơn 1), thì hiển thị thông báo lỗi và kết thúc chương trình.
        //
        //- Bước 3: Kiểm tra tính số nguyên tố
        //Sử dụng vòng lặp để kiểm tra xem số có chia hết cho các số từ 2 đến căn bậc hai của số đó hay không. Nếu có sự chia hết, thì số không phải là số nguyên tố.
        //
        //- Bước 4: Hiển thị kết quả
        //Nếu số không bị loại trừ ở Bước 2 và Bước 3, thì in ra rằng số đó là số nguyên tố
                Scanner scanner =new Scanner(System.in);
                while (true) {
                    System.out.println("Mời bạn nhập số kiểm tra");
                    boolean isPrime = true;
                    int numberCheck;
                    try {
                        numberCheck = Integer.parseInt(scanner.nextLine());
                        if (numberCheck < 2) {
                            return;
                        } else {
                            for (int i = 2; i <= Math.sqrt(numberCheck); i++) {
                                if (numberCheck % i == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                        }
                        if (isPrime) {
                            System.out.println(numberCheck + " là số nguyên tố");
                        } else {
                            System.out.println(numberCheck + " không là số nguyên tố");
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("số bạn nhập không phải số nguyên");
                    }
                }
            }
        }
