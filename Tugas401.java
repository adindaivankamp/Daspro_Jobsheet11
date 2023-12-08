import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tugas401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        ArrayList<String> allAthletes = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Masukkan nama atlet untuk cabang olahraga ke-" + (i + 1) + ": ");
            String input = scanner.nextLine();

            String[] athletes = input.split("\\s+");
            Collections.addAll(allAthletes, athletes);
        }

       
        Collections.sort(allAthletes);

        System.out.println("Nama Atlet (Secara Ascending):");
        for (String athlete : allAthletes) {
            System.out.println(athlete);
        }

       
    }
}

