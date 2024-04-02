import java.util.Scanner;

public class B2 {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        int[] arrNumber;
        int n;
        System.out.print("Nhập số phần tử của mảng : ");
        n = Integer.parseInt(scanner.nextLine());
        arrNumber = new int[n];

        for (int i : arrNumber) {
            System.out.print("Nhập phần tử thứ " + (i + 1));
            arrNumber[i] = Integer.parseInt(scanner.nextLine());

        }
        try {
            if (n == 0) {
                throw new IllegalAccessException("Mảng không có phần tử.");
            }
            int max = arrNumber[0];
            for (int i = 0; i < n; i++) {
                if (arrNumber[i] > max) {
                    max = arrNumber[i];
                }

            }
            System.out.printf("Số lớn nhất trong mảng là :  " + max);

        } catch (Exception e) {
            throw new IllegalAccessException(e.getMessage());
        }


    }
}
