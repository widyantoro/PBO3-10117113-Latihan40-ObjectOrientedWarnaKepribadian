/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan40.objectorientedwarnakepribadian;

import java.util.Scanner;

/**
 *
 * Nama     : Eka Widyantoro
 * Kelas    : IF-3
 * NIM      : 10117113
 * Deskripsi Program : program ini berisi program menentukan kepribadian 
 * seseorang dari warna kesukaanya 
 * 
 */
public class PBO310117113Latihan40ObjectOrientedWarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String warnaK;
        String nama;
        Warna warni = new Warna();
        Scanner scn = new Scanner(System.in);

        System.out.print(Warna.ANSI_RED + "YUK "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_GREEN + "CEK "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_YELLOW + "KEPRIBADIANMU "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_CYAN + "DARI "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_PURPLE + "WARNA "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_BLUE + "FAVORITMU "
                + Warna.ANSI_RESET + "\n");

        System.out.print("\n" + Warna.ANSI_RED_BACKGROUND + Warna.ANSI_WHITE
                + "\t MERAH \t\t\n" + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_GREEN_BACKGROUND + Warna.ANSI_WHITE
                + "\t HIJAU \t\t\n" + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_YELLOW_BACKGROUND + Warna.ANSI_WHITE
                + "\t KUNING \t\n" + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_BLUE_BACKGROUND + Warna.ANSI_WHITE
                + "\t BIRU \t\t\n" + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_PURPLE_BACKGROUND + Warna.ANSI_WHITE
                + "\t UNGU \t\t\n\n" + Warna.ANSI_RESET);

        System.out.print("PILIH WARNA FAVORITMU : ");
        warnaK = scn.next();
        System.out.print("NAMA KAMU : ");
        nama = scn.next();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + nama.toUpperCase() + "====");
        Warna.hasilTest(warnaK);
    }
    
}
