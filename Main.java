//package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
		Scanner loopi = new Scanner (System.in);
	
		Scanner input = new Scanner (System.in);
		Scanner input2 = new Scanner (System.in);
		String menu, menu2, menu3, elt, spr, prb, lapor, pilih, trs1, trs2, trs3;
		
		do {
		
		System.out.println("\nMenu Utama : ");
		System.out.println("\t - Laporan");
		System.out.println("\t - Admin");
		//System.out.println("\t - Transaksi");
		System.out.println("\t - Barang");
		System.out.print("\nSilahkan Pilih Menu Yang Akan Ditampilkan : ");
		menu = input.nextLine();
		
		if("Laporan".equals(menu)) {
			Laporan lap = new Laporan();
			System.out.println("\n>>>>>>> MENGELOLA LAPORAN <<<<<<<\n");
			lap.buat_laporan();
			System.out.print("\nKelola Laporan : (ubah / hapus / cetak) ?");
			lapor = input.nextLine();
			if ("ubah".equals(lapor)) {
			lap.ubah_lap();
			} else if ("hapus".equals(lapor)) {
			lap.hapus_lap();
			} else if ("cetak".equals(lapor)) {
			lap.cetak();
			}
			}			
			
		else if ("Barang".equals(menu)) {
			System.out.println("\nPilihan Tipe Barang : ");
			System.out.println("\t - Elektronik");
			System.out.println("\t - Sparepart");
			System.out.println("\t - Perabotan");
			System.out.print("\nSilahkan Pilih Tipe Barang Yang Akan Ditampilkan : ");
			menu2 = input.nextLine();
			if("Elektronik".equals(menu2)) {
				Elektronik TR = new Elektronik();
				System.out.println("\n>>>>>>> MENGELOLA BARANG <<<<<<<\n");				
				TR.tambah_elektronik();
				System.out.print("\nKelola Elektronik : (ubah / hapus / kelola transaksi) ?");
				elt = input.nextLine();
				if ("ubah".equals(elt)) {
				TR.ubah_elektronik();
				} else if ("hapus".equals(elt)) {
				TR.hapus_elektronik();
				} else if ("kelola transaksi".equals(elt)) {
				System.out.println("\n>>>>>>> MENGELOLA TRANSAKSI <<<<<<<\n");
				System.out.print("\nKelola Transaksi : (jual / retur) ?");
				trs1 = input2.nextLine();
					if ("jual".equals(trs1)) {
					TR.jual_brg();
					} else if ("retur".equals(trs1)) {
					TR.retur_brg();
					}
			}
			}
			
			else if("Sparepart".equals(menu2)) {
				Sparepart SP = new Sparepart();
				System.out.println("\n>>>>>>> MENGELOLA BARANG <<<<<<<\n");				
				SP.tambah_sparepart();
				System.out.print("\nKelola Sparepart : (ubah / hapus / kelola transaksi) ?");
				spr = input.nextLine();
				if ("ubah".equals(spr)) {
				SP.ubah_sparepart();
				} else if ("hapus".equals(spr)) {
				SP.hapus_sparepart();
				} else if ("kelola transaksi".equals(spr)) {
				System.out.println("\n>>>>>>> MENGELOLA TRANSAKSI <<<<<<<\n");
				System.out.print("\nKelola Transaksi : (jual / retur) ?");
				trs2 = input2.nextLine();
					if ("jual".equals(trs2)) {
					SP.jual_brg();
					} else if ("retur".equals(trs2)) {
					SP.retur_brg();
					}
			}
			}
			
			else if("Perabotan".equals(menu2)) {
				Perabotan PR = new Perabotan();
				System.out.println("\n>>>>>>> MENGELOLA BARANG <<<<<<<\n");				
				PR.tambah_perabotan();
				System.out.print("\nKelola Perabotan : (ubah / hapus / kelola transaksi) ?");
				prb = input.nextLine();
				if ("ubah".equals(prb)) {
				PR.ubah_perabotan();
				} else if ("hapus".equals(prb)) {
				PR.hapus_perabotan();
				} else if ("kelola transaksi".equals(prb)) {
				System.out.println("\n>>>>>>> MENGELOLA TRANSAKSI <<<<<<<\n");
				System.out.print("\nKelola Transaksi : (jual / retur) ?");
				trs3 = input2.nextLine();
					if ("jual".equals(trs3)) {
					PR.jual_brg();
					} else if ("retur".equals(trs3)) {
					PR.retur_brg();
					}
			}
			}
				
			}
				
			
			
		//else if ("Transaksi".equals(menu)) {
			//Transaksi TRAN = new Transaksi();
			//System.out.println("\n\n>>>>>>> MENGELOLA TRANSAKSI <<<<<<<\n");
			//System.out.print("\nKelola Transaksi : (jual / retur) ? : ");
			//trs = input.nextLine();
			//if ("jual".equals(trs)) {
				//TRAN.trans_jual();
			//} else if ("retur".equals(trs)) {
				//TRAN.trans_retur();
			//}
			//}
			
		
		else if ("Admin".equals(menu)) {
			Admin ADM = new Admin();
			System.out.println("\n>>>>>>> MENGELOLA DATA ADMIN <<<<<<<\n");
			ADM.menginput_admin();
			ADM.menampilkan_data_admin();
		}
		
		System.out.print("\nKembali Ke Menu Utama? (Ya / Tidak) : ");
		pilih = loopi.nextLine();
		
		}
		
		while ("Ya".equals(pilih));
		System.out.println("\n>>>>>>> Terimakasih Telah Menggunakan Aplikasi Ini ^_^ <<<<<<<\n");
		
		}
		
    }