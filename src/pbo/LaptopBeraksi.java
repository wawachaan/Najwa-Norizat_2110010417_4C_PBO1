
package pbo;

import java.util.Scanner;


public class LaptopBeraksi {
     public static void main(String[] args) {

//Error handling
try{
    //io sederhana
    Scanner scanner = new Scanner (System.in);

    //array
        LaptopDetail[] lptp = new LaptopDetail[2];
        for(int i=0; i<lptp.length; i++) {
                System.out.println("=========================================");
                System.out.println("            FOURTUNE COMPUTER            ");
                System.out.println("=========================================");
                System.out.print("Masukkan Nama Costumer "+(i+1)+" : ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Nama Barang "+(i+1)+" : ");
                String jenis = scanner.nextLine();
                System.out.print("Masukkan Nomor Seri "+(i+1)+" : ");
                String seri = scanner.nextLine();
     //objek
                lptp[i] = new LaptopDetail (nama, jenis, seri);
    }

        for(LaptopDetail data: lptp) {
            System.out.println("=========================================");
             System.out.println("            FOURTUNE COMPUTER            ");
            System.out.println("=========================================");
            System.out.println(data.displayInfo());
        }
    } catch (NumberFormatException e){
        System.out.println("Kesalahan format Jenis: "+e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Kesalahan format Seri : "+e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan umum: "+e.getMessage());
    }
  } 
}
