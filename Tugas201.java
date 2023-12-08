import java.util.Scanner;

public class Tugas201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 5): ");
        int nilaiN = scanner.nextInt();

        if (nilaiN < 5) {
            System.out.println("Nilai N minimal 5.");
            return;
        }

        for (int i = nilaiN; i >= 1; i--) {
          
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            
            System.out.println();
        }

        scanner.close();
    }
}
 
