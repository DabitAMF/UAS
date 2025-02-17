import java.util.Scanner;

public class Soal1Tim5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] cabangOlahraga = {"Badminton", "Basket", "Bola Voli"};
        String[] atlet = new String[18]; 

        
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Masukkan nama atlet untuk cabang " + cabangOlahraga[i] + ":");
            for (int j = 0; j < 2; j++) { 
                System.out.println("Politeknik " + (j + 1) + ":");
                for (int k = 0; k < 3; k++) {  
                    String namaAtlet;
                    do {
                        System.out.print("Atlet " + (k + 1) + ": ");
                        namaAtlet = scanner.nextLine();
                        if (namaAtlet.isEmpty()) {
                            System.out.println("Nama atlet tidak boleh kosong. Silakan masukkan lagi.");
                        }
                    } while (namaAtlet.isEmpty());
                    atlet[k] = namaAtlet;
                }
            }
        }


        System.out.println("\nInformasi Nama Atlet:");
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Cabang " + cabangOlahraga[i] + ":");
            for (int j = 0; j < 2; j++) {
                System.out.println("Politeknik " + (j + 1) + ":");
                for (int k = 0; k < 3; k++) {
                    System.out.println("Atlet " + (k + 1) + ": " + atlet[k]);
                }
            }
        }

        scanner.close();
    }
}