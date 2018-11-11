package program;

import java.util.Scanner;

public class Main {
    
    public static void TampilData() {    
    }
    
    public static void InputData() {
        program.Mahasiswa mahasiswa = new program.Mahasiswa();
        Scanner s = new Scanner(System.in);
        System.out.print("Nim : ");
        String nims = s.nextLine();
        System.out.print("Nama: ");
        String nama = s.nextLine();
        System.out.print("IPK : ");
        String ipk = s.nextLine();
        mahasiswa.isiData(nims, nama, ipk);
    }
    
    public static void main(String[] args) {
        program.Mahasiswa mhs =  new program.Mahasiswa();
        int pil;/*Mahasiswa*/
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("");
            System.out.println("Tugas tentang class-object");
            System.out.println("--------------------------");
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Urut data");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pil = s.nextInt();
            switch (pil) {
                case 1:
                    InputData();
                    break;
                case 2:
                    mhs.tampilData();
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Sorting data mahasiswa");
                    System.out.println("----------------------");
                    System.out.println("1. Berdasarkan Nim");
                    System.out.println("2. Berdasarkan Nama");
                    System.out.println("3. Berdasarkan IPK");
                    System.out.println("4. Kembali kel awal");
                    System.out.println("Pilih : ");
                    pil = s.nextInt();
                    if (pil == 1) {
                        mhs.sortNim();
                    } else if (pil == 2) {
                        mhs.sortNama();
                    } else if (pil == 3) {
                        mhs.sortIpk();
                    }
                    break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }        
           
        } while (pil != 4);
        
        
    }
    
}