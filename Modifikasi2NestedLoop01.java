import java.util.Scanner;

public class Modifikasi2NestedLoop01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        
         for (int i =0; i< temps.length; i++){
            System.out.println("City: " + i);
            double total = 0;

            for (int j= 0; j < temps [0].length; j++ ){
                System.out.print("Day" + (j+1) + ":");
                temps [i][j] = scanner.nextDouble();
                total += temps[i][j];

            }
            double RataRata = total / temps[i].length;
            System.out.println("Temperature rata-rata: " + RataRata);
            System.out.println();
        }
    }
}
