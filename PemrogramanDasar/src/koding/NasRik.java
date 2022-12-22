package koding;

public class NasRik {
	int Jumlah5;
	
	public int getuJumlah5() {
		return Jumlah5;
	}
	
	public void setJumlah4(int Jumlah5) {
		this.Jumlah5 = Jumlah5;
	}
	
	public int getTotal5() {
		int total5 = 9000 * Jumlah5;
		return total5;
	}
}
