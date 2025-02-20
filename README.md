import java.util.Scanner; // berfungsi untuk mengimpor kelas berupa Scanner untuk membaca input dari pengguna

public class Soal1Tim5 { // Mendeklarasi kelas yang bernama Soal1Tim5
    public static void main(String[] args) { // Metode utama (entry point) program

        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca inputan dari pengguna

        String[] cabangOlahraga = {"Badminton", "Basket", "Bola Voli"}; // Mendeklarasi array berupa string yang berisi nama-nama cabang olahraga yang terdaftar

        String[] atlet = new String[18]; // Mendeklarasi array berupa string dengan ukuran 18 untuk menyimpan nama atlet yang akan didaftarkan

        // Loop yang berfungsi untuk memasukkan data atlet yang akan didaftarkan dari pengguna
        for (int i = 0; i < cabangOlahraga.length; i++) { // Loop melalui setiap cabang olahraga yang terdaftar
            System.out.println("Masukkan nama atlet untuk cabang " + cabangOlahraga[i] + ":"); // Menampilkan tempat untuk memasukkan data nama atlet yang akan didaftarkan
            for (int j = 0; j < 2; j++) { // Loop melalui setiap Politeknik (2 Politeknik) dari cabang olahraga yang terdaftar
                System.out.println("Politeknik " + (j + 1) + ":"); // Menampilkan tempat untuk memasukkan data nama atlet dari setiap Politeknik yang akan didaftarkan
                for (int k = 0; k < 3; k++) { // Loop melalui setiap atlet (3 atlet) dari masing-masing Politeknik
                    String namaAtlet; // Deklarasi variabel string untuk menyimpan nama atlet yang akan didaftarkan
                    do { // Loop do-while untuk memastikan nama atlet tidak kosong saat pengisian data atlet
                        System.out.print("Atlet " + (k + 1) + ": "); // Menampilkan tempat untuk memasukkan nama atlet yang akan didaftarkan
                        namaAtlet = scanner.nextLine(); // Membaca inputan nama atlet dari apa yang didaftarkan pengguna
                        if (namaAtlet.isEmpty()) { // berfungsi untuk memeriksa apakah nama atlet kosong atau tidak
                            System.out.println("Nama atlet tidak boleh kosong. Silakan masukkan lagi."); // Menampilkan pesan kesalahan pada pengguna jika nama atlet ada yang kosong
                        }
                    } while (namaAtlet.isEmpty()); // Mengulangi loop do-while jika nama atlet yang diinputkan pleh pengguna itu kosong
                    atlet[k] = namaAtlet; // Menyimpan nama atlet yang telah didaftarkan oleh pengguna ke dalam array atlet
                }
            }
        }

        // Menampilkan data atlet yang sudah didaftarkan
        System.out.println("\nInformasi Nama Atlet:"); // Menampilkan judul informasi nama atlet yang terdaftar
        for (int i = 0; i < cabangOlahraga.length; i++) { // Loop melalui setiap cabang olahraga yang sudah terdaftar di awal
            System.out.println("Cabang " + cabangOlahraga[i] + ":"); // Menampilkan nama cabang olahraga yang sudah terdaftar
            for (int j = 0; j < 2; j++) { // Loop melalui setiap Politeknik (2 Politeknik) yang sudah didaftarkan
                System.out.println("Politeknik " + (j + 1) + ":"); // Menampilkan nama Politeknik yang sudah terdaftar
                for (int k = 0; k < 3; k++) { // Loop melalui setiap atlet (3 atlet) yang sudah didaftarkan
                    System.out.println("Atlet " + (k + 1) + ": " + atlet[k]); // Menampilkan nama atlet yang akan mengikuti setiap cabang olahraga
                }
            }
        }

        scanner.close(); // Menutup objek Scanner yang telah dibuat pada awal program 
    }
}