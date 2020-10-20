//program penghitungan nilai ulangan
package tugas.pkg4;

//Mengimport scanner
import java.util.Scanner;
public class Tugas4 {

    public static void main(String[] args) {
        //Membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        //Cetak judul
          System.out.println("---->>>>>>>>  IDENTITAS SISWA  <<<<<<<----");
          
          //Mencetak output untuk meminta data kepada user
          System.out.print("Nama : ");
          //Menggunakan scanner
          String nama = input.nextLine();
          System.out.print("[Tanggal Ulangan] : ");
          int tanggal = input.nextInt();
          System.out.print("[Bulan Ulangan] : ");
          String bulan = input.next();
          System.out.print("[Tahun Ulangan] : ");
          int tahun = input.nextInt();
          
          System.out.print("Tulis berapa nilaimu : ");
          int nilai = input.nextInt();
          
          

          //Percabangan if (jika nilai di atas atau samadengan 90)
          if (nilai >= 90){
              //Cetak grade (Nilai)
              System.out.println("Grade : A");
              //Cetak pesan
              System.out.println("Pertahankan!");
          //Percabangan else if (jika nilai di atas 80 atau sama dengan 80)
          }else if(nilai >= 80){
              System.out.println("Grade : B+");
              System.out.println("Belajar giat sedikit lagi pasti dapat A");
          //Percabangan else if (jika nilai di atas 70 atau sama dengan 70)
          }else if(nilai >= 70){
              System.out.println("Grade : B ");
              System.out.println("Teliti dan perbanyak belajar ya..");
          //Percabangan else (jika nilainya dibawah 70)
          }else{
              System.out.println("Grade : F");
              System.out.println("Jangan menyerah!");
          }
          //Cetak nama, waktu, nilai, dan pesan
          System.out.println("---->>>>>>>>  HASIL NILAI ULANGAN  <<<<<<<<----");
          System.out.println("Nama : "+nama);
          System.out.println("Waktu Ulangan : "+tanggal+"/"+bulan+"/"+tahun);
          System.out.println("Nilai-Mu : "+nilai);
          System.out.println("---->>>>>>>>  Apapun nilaimu guru pasti pangga, karena kamu mengerjakannya sendiri  <<<<<<<<----");
          
     }
}
    

// 1. Mulai

// 2. Mengimpor scanner
// 3. Buat new scanner
// 4. Tampilkan judul
// 5. Cetak output untuk user memasukkan nama
// 5. Menggunakan scanner
// 6. Menyimpan data scanner dari user
// 7. Cetak hasil sementara

// 8. Gunakan percabangan if, else if, dan else
// 9. If untuk percabangan pertama dimana jika nilai lebih besar dari 90 maka akan di anggap nilai "A". Begitupun seterusnya
// 10. Untuk pilihan nilainya ada, >-90, >=80, >=70, dan <=70
// 11. Cetak kata2 penyemangat (didalam if, else if, dan else)
// 12. Cetak pesan

// 13. Selesai
    
    

