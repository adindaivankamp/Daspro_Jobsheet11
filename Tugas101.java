import java.util.Scanner;

public class Tugas101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int nilaiN = scanner.nextInt();

        if (nilaiN < 3) {
            System.out.println("Nilai N minimal 3.");
            return;
        }

        for (int i = 1; i <= nilaiN; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }
}

