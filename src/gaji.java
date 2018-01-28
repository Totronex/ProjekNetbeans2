package Gaji;
import java.util.Scanner;
public class gaji {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
    String nama;
    int jam_kerja;
    int hari_kerja;
    int kerja_ot;
    int gaji;
    
    System.out.print("Sila masukkan nama anda :");
    nama=input.nextLine();
    System.out.print("Sila masukkan jam bekerja :");
    jam_kerja=input.nextInt();
        while (jam_kerja>9){
    System.out.print("Sila masukkan jam bekerja yang betul :");
    }
    System.out.print("Sila masukkan hari bekerja :");
    hari_kerja=input.nextInt();
        while (hari_kerja>30){
    System.out.print("Sila masukkan hari bekerja yang betul :");
    }
    System.out.print("Sila masukkan jam bekerja lebih masa :");
    kerja_ot=input.nextInt();
        while (kerja_ot>50){
    System.out.print("Sila masukkan jam berkerja lebih masa yang betul :");
    }
    gaji=(jam_kerja*hari_kerja*20)+(kerja_ot*15);
    
    System.out.println("Rumusan gaji bulanan "+nama);
    System.out.println("Jumlah jam bekerja "+jam_kerja+"jam");
    System.out.println("Jumlah hari bekerja "+hari_kerja+"hari");
    System.out.println("Jumlah bekerja lebih masa "+kerja_ot+"jam");
    System.out.println("Jumlah gaji: RM"+gaji);
    }
}