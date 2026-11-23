package dat109.hvl.no.bilutleie;

import java.time.LocalDateTime;

public class Utleie {

	private Kunde kunde;
	private Bil bil;
	private String regNummer;
	private int kmStand;
	private LocalDateTime startDato;
	private LocalDateTime sluttDato;
	private LocalDateTime forventetReturDato;
	private String betalingStatus; // betalt, venter
	
	public Utleie(Kunde kunde, Bil bil, String regNummer, int kmStand, LocalDateTime startDato, LocalDateTime sluttDato,
			LocalDateTime forventetReturDato) {
		this.kunde = kunde;
		this.bil = bil;
		this.regNummer = regNummer;
		this.kmStand = kmStand;
		this.startDato = startDato;
		this.sluttDato = sluttDato;
		this.forventetReturDato = forventetReturDato;
		this.betalingStatus = "Pending";
	}


	public Kunde getKunde() {
		return kunde;
	}

	public Bil getBil() {
		return bil;
	}

	public String getRegNummer() {
		return regNummer;
	}

	public int getKmStand() {
		return kmStand;
	}

	public LocalDateTime getStartDato() {
		return startDato;
	}

	public LocalDateTime getSluttDato() {
		return sluttDato;
	}

	public LocalDateTime getForventetReturDato() {
		return forventetReturDato;
	}

	public String getBetalingStatus() {
		return betalingStatus;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public void setBil(Bil bil) {
		this.bil = bil;
	}

	public void setRegNummer(String regNummer) {
		this.regNummer = regNummer;
	}

	public void setKmStand(int kmStand) {
		this.kmStand = kmStand;
	}

	public void setStartDato(LocalDateTime startDato) {
		this.startDato = startDato;
	}

	public void setSluttDato(LocalDateTime sluttDato) {
		this.sluttDato = sluttDato;
	}

	public void setForventetReturDato(LocalDateTime forventetReturDato) {
		this.forventetReturDato = forventetReturDato;
	}

	public void setBetalingStatus(String betalingStatus) {
		this.betalingStatus = betalingStatus;
	}


	@Override
	public String toString() {
		return "Utleie [kunde=" + kunde + ", bil=" + bil + ", regNummer=" + regNummer + ", kmStand=" + kmStand
				+ ", startDato=" + startDato + ", sluttDato=" + sluttDato + ", forventetReturDato=" + forventetReturDato
				+ ", betalingStatus=" + betalingStatus + "]";
	} 
	
	
	
}
