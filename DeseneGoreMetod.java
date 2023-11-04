package java101;
import java.util.Scanner;

public class DeseneGoreMetod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        scanner.close();

        manipulateNumber(sayi);
    }

    public static void manipulateNumber(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }

        System.out.println(n); // Her işlem öncesinde sayıyı yazdırın

        if (n > 0) {
            manipulateNumber(n - 5);
        } else {
            manipulateNumber(n + 5);
        }

    }
}
