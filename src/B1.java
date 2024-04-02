import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne, numberTwo;

        while (true) {
            try {
                System.out.printf("Nhập số thứ nhất : ");
                numberOne = Integer.parseInt(scanner.nextLine());
                break;


            } catch (NumberFormatException e){
                System.err.println("Bạn phải nhập 1 số nguyên.");
            }

        }

        while (true) {
            try {
                System.out.printf("Nhập số thứ hai : ");
                numberTwo = Integer.parseInt(scanner.nextLine());
                break;


            } catch (RuntimeException e){
                System.err.println("Bạn phải nhập 1 số nguyên.");
            }

        }

        int sum = numberTwo + numberOne;

        System.out.printf("Tổng 2 số nguyên đã nhập là " +sum);




    }
}
