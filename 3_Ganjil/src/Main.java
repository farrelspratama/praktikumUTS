import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        long number = scanner.nextLong();
        int sum = sumDigits(number);
        System.out.println("Jumlah digit dalam bilangan adalah: " + sum);
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10; // Ambil digit terakhir
            n /= 10; // Hapus digit terakhir
        }
        return sum;
    }
}
