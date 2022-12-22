package koding;

import java.util.Scanner;

public class WarungMakan {

	public static void main(String[] args) {
				
		int pilihan;
		char yesNo;
		
		Scanner input = new Scanner(System.in);
		
		int totalBayar;
		NasGor Ngr = new NasGor();
		NasDuk Ndk = new NasDuk();
		NasKun Nkn = new NasKun();
		NasCing Nkc = new NasCing();
		NasRik Nrk = new NasRik();
		NasLang Nlg = new NasLang();
		
		System.out.println("Warung Makan");
		System.out.println("Rindu Nasi");
		System.out.println("---------------");
		System.out.println("1. Nasi Goreng__________Rp. 10.000");
		System.out.println("2. Nasi Uduk____________Rp. 8.000");
		System.out.println("3. Nasi Kuning__________Rp. 9.500");
		System.out.println("4. Nasi Kucing__________Rp. 2.000");
		System.out.println("5. Nasi Orak-arik_______Rp. 9.000");
		System.out.println("6. Nasi Magelangan______Rp. 12.000");
		System.out.println("7. Keluar");
		System.out.println("-----------------------------------");
		
		
		do {
			System.out.print("Pilih [1-7] : ");
		pilihan = input.nextInt();
		
		
		switch(pilihan) {
		
		case 1 :
			System.out.print("Nasi Goreng, beli berapa porsi = ");
			Ngr.Jumlah1 = input.nextInt();
			System.out.println("Nasi Goreng yang anda pesan seharga = Rp. " + Ngr.getTotal1() + "\n" );
			break;
			
		case 2 :
			System.out.print("Nasi Uduk, beli berapa porsi = ");
			Ndk.Jumlah2 = input.nextInt();
			System.out.println("Nasi uduk yang anda pesan seharga = Rp. " + Ndk.getTotal2() +  "\n");
			break;
			
		case 3 :
			System.out.print("Nasi Kuning, beli berapa porsi = ");
			Nkn.Jumlah3 = input.nextInt();
			System.out.println("Nasi Kuning yang anda pesan seharga = Rp. " + Nkn.getTotal3() + "\n");
			break;
			
		case 4 :
			System.out.print("Nasi Kucing, beli berapa porsi = ");
			Nkc.Jumlah4 = input.nextInt();
			System.out.println("Nasi Kucing yang anda pesan seharga = Rp. "+ Nkc.getTotal4() + "\n");
			break;
			
		case 5 :
			System.out.print("Nasi Orak-Arik, beli berapa porsi =");
			Nrk.Jumlah5 = input.nextInt();
			System.out.println("Nasi Orak-Arik yang anda pesan seharga = Rp. " + Nrk.getTotal5() + "\n");
			break;
			
		case 6 :
			System.out.print("Nasi Magelangan, beli berapa porsi = ");
			Nlg.Jumlah6 = input.nextInt();
			System.out.println("Nasi Magelangan yang anda pesan seharga = Rp. "+ Nlg.getTotal6()  + "\n");
			break;
			
		case 7 :
			System.out.print("Tidak jadi memesan, Sistem Keluar");
			System.exit(0);
			
		default :
			System.out.println("Pilihan yang anda masukkan salah!!!");
		}
		System.out.print("Tambah pesanan klik y, jika tidak klik n : ");
		yesNo = input.next().charAt(0);
		} 
		
		while(yesNo != 'n');
		
		totalBayar = (Ngr.getTotal1() + Ndk.getTotal2() + Nkn.getTotal3() + Nkc.getTotal4() + Nrk.getTotal5() + Nlg.getTotal6());
		System.out.println("Total yang harus dibayar = Rp. " + totalBayar);
		input.close();
					
	}
	
}
			

		
				



