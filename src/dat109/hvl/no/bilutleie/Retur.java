package dat109.hvl.no.bilutleie;

import java.time.LocalDateTime;

public class Retur {

	private Betaling betaling;
	private LocalDateTime returDato;
	private int kmStandRetur;
	private double betalingPris;
	private String betalingMetode;
	public Retur(Betaling betaling, LocalDateTime returDato, int kmStandRetur, double betalingPris,
			String betalingMetode) {
	
		this.betaling = betaling;
		this.returDato = returDato;
		this.kmStandRetur = kmStandRetur;
		this.betalingPris = betalingPris;
		this.betalingMetode = betalingMetode;
	}
	
	public Betaling getBetaling() {
		return betaling;
	}
	public LocalDateTime getReturDato() {
		return returDato;
	}
	public int getKmStandRetur() {
		return kmStandRetur;
	}
	public double getBetalingPris() {
		return betalingPris;
	}
	public String getBetalingMetode() {
		return betalingMetode;
	}
	public void setBetaling(Betaling betaling) {
		this.betaling = betaling;
	}
	public void setReturDato(LocalDateTime returDato) {
		this.returDato = returDato;
	}
	public void setKmStandRetur(int kmStandRetur) {
		this.kmStandRetur = kmStandRetur;
	}
	public void setBetalingPris(double betalingPris) {
		this.betalingPris = betalingPris;
	}
	public void setBetalingMetode(String betalingMetode) {
		this.betalingMetode = betalingMetode;
	}

	@Override
	public String toString() {
		return "Retur [betaling=" + betaling + ", returDato=" + returDato + ", kmStandRetur=" + kmStandRetur
				+ ", betalingPris=" + betalingPris + ", betalingMetode=" + betalingMetode + "]";
	}
	
	
	
}
