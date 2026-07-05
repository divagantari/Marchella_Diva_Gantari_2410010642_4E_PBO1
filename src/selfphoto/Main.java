package selfphoto;

import java.util.Scanner;

//CLASS
public class Main {

    public static void main(String[] args) {

        //IO SEDERHANA
        Scanner input = new Scanner(System.in);

        //ARRAY
        PelangganStudio pelanggan[] = new PelangganStudio[10];

        try{

            System.out.println("=================================");
            System.out.println("      SELF PHOTO STUDIO         ");
            System.out.println("    Abadikan Momen Terbaikmu");
            System.out.println("=================================");

            System.out.print("\nMasukkan jumlah pelanggan : ");
            int jumlah = input.nextInt();
            input.nextLine();

            //PERULANGAN
            for(int i=0;i<jumlah;i++){

                System.out.println("\n===== DATA PELANGGAN "+(i+1)+" =====");

                System.out.print("Nama : ");
                String nama = input.nextLine();

                System.out.print("No HP : ");
                String nomorHp = input.nextLine();

                //OBJECT
                pelanggan[i] = new PelangganStudio(
                        nama,
                        nomorHp
                );

                PelangganStudio p = pelanggan[i];

                String idSession="MB00"+(i+1);

                System.out.print("Jumlah orang yang foto : ");
                int jumlahOrang=input.nextInt();

                int biayaJumlahOrang=0;

                //SELEKSI
                if(jumlahOrang==1){

                    biayaJumlahOrang=0;

                }
                else if(jumlahOrang==2){

                    biayaJumlahOrang=10000;

                }
                else if(jumlahOrang<=4){

                    biayaJumlahOrang=20000;

                }
                else{

                    biayaJumlahOrang=30000;

                }

                System.out.println("\n===== TEMA FOTO =====");
                System.out.println("Pilih salah satu:");
                System.out.println("1. Galaxy Adventure");
                System.out.println("2. Sweet Candy Room");
                System.out.println("3. Retro Memories");
                System.out.println("4. Fantasy Garden");

                System.out.print("Masukkan pilihan : ");

                int pilihTema=input.nextInt();

                String tema="";

                switch(pilihTema){

                    case 1:
                        tema="Galaxy Adventure";
                        break;

                    case 2:
                        tema="Sweet Candy Room";
                        break;

                    case 3:
                        tema="Retro Memories";
                        break;

                    case 4:
                        tema="Fantasy Garden";
                        break;

                    default:
                        tema="Tema Tidak Tersedia";

                }

                System.out.println("\n===== PILIH HEWAN =====");
                System.out.println("Pilih salah satu:");
                System.out.println("1. Tidak Membawa Hewan");
                System.out.println("2. Kucing");
                System.out.println("3. Anjing");
                System.out.println("4. Burung");

                System.out.print("Masukkan pilihan : ");

                int hewan=input.nextInt();

                int biayaHewan=0;
                String jenisHewan="";

                switch(hewan){

                    case 1:
                        jenisHewan="Tidak Ada";
                        biayaHewan=0;
                        break;

                    case 2:
                        jenisHewan="Kucing";
                        biayaHewan=10000;
                        break;

                    case 3:
                        jenisHewan="Anjing";
                        biayaHewan=15000;
                        break;

                    case 4:
                        jenisHewan="Burung";
                        biayaHewan=8000;
                        break;

                }

                System.out.println("\n===== TAMBAH WAKTU =====");
                System.out.println("1. +15 Menit");
                System.out.println("2. +30 Menit");
                System.out.println("3. Tidak");

                System.out.print("Masukkan pilihan : ");

                int waktu=input.nextInt();

                int biayaTambahanWaktu=0;

                if(waktu==1){

                    biayaTambahanWaktu=10000;

                }

                else if(waktu==2){

                    biayaTambahanWaktu=20000;

                }

                System.out.println("\n===== HASIL FOTO =====");
                System.out.println("1. Softcopy");
                System.out.println("2. Cetak");
                System.out.println("3. Album Mini");

                System.out.print("Masukkan pilihan : ");

                int hasil=input.nextInt();

                int biayaHasilFoto=0;
                String hasilFoto="";

                switch(hasil){

                    case 1:
                        hasilFoto="Softcopy";
                        biayaHasilFoto=0;
                        break;

                    case 2:
                        hasilFoto="Cetak";
                        biayaHasilFoto=10000;
                        break;

                    case 3:
                        hasilFoto="Album Mini";
                        biayaHasilFoto=25000;
                        break;

                }

                //OBJECT
                SessionFoto session =
                        new SessionFoto(
                                tema,
                                50000,
                                30,
                                biayaTambahanWaktu,
                                biayaHewan,
                                biayaHasilFoto,
                                biayaJumlahOrang
                        );

                System.out.println("\n===== HASIL SESSION =====");

                System.out.println("ID Session : "+idSession);
                System.out.println("Nama : "+p.getNama());
                System.out.println("No HP : "+p.getNomorHp());
                System.out.println("Jumlah Orang : "+jumlahOrang);
                System.out.println("Tema : "+tema);
                System.out.println("Hewan : "+jenisHewan);
                System.out.println("Hasil Foto : "+hasilFoto);

                System.out.println(
                        "Total Bayar : Rp"
                        +session.hitungTotal()
                );

                input.nextLine();

            }

            System.out.println("\n=================================");
            System.out.println("Terima kasih sudah menggunakan");
            System.out.println("Self Photo Studio");
            System.out.println("Semoga momen terbaikmu");
            System.out.println("menjadi kenangan yang indah");
            System.out.println("=================================");

        }

        //ERROR HANDLING
        catch(Exception e){

            System.out.println(
                    "Terjadi kesalahan : "
                    +e.getMessage()
            );

        }

    }

}