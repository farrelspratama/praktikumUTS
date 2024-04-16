import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positif = 0;
        int negatif = 0;
        double total = 0;
        int count = 0;

        System.out.println("Masukan bilangan integer, program akan berhenti jika memasukan nilai 0:");

        while (true) {
            int nilai = input.nextInt();
            
            if (nilai == 0) {
                break;
            } else if (nilai > 0) {
                positif++;
            } else {
                negatif++;
            }
            
            if (nilai != 0) {
                total += nilai;
                count++;
            }
        }

        double rataRata = (count == 0) ? 0 : total / count;

        System.out.println("Jumlah bilangan positif adalah " + positif);
        System.out.println("Jumlah bilangan negatif adalah " + negatif);
        System.out.println("Nilai total adalah " + total);
        System.out.println("Nilai rata - rata " + rataRata);
    }
}
