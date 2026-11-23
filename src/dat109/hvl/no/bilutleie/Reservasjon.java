package dat109.hvl.no.bilutleie;


import java.time.Duration;
import java.time.LocalDateTime;

public class Reservasjon {

	private Kunde kunde;
	private Utleiekontor kontor;
	private String bilKategori;
	private LocalDateTime startDato;
	private LocalDateTime endDato;
	private String status; //pending, confirmed, cancelled
	private double pris;
	public Reservasjon(Kunde kunde, Utleiekontor kontor, String bilKategori, LocalDateTime startDato,
			LocalDateTime endDato) {
		super();
		this.kunde = kunde;
		this.kontor = kontor;
		this.bilKategori = bilKategori;
		this.startDato = startDato;
		this.endDato = endDato;
		this.status = "Pending";
		this.pris = calculatePris();
	}
	/**
	 * 
	 * @return prisEstimat
	 */
	public double calculatePris()	{
		double dagPris = 500.0;
		int dager = (int) Duration.between(startDato, endDato).toDays();
		return dagPris * dager;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public Utleiekontor getKontor() {
		return kontor;
	}

	public String getBilKategori() {
		return bilKategori;
	}

	public LocalDateTime getStartDato() {
		return startDato;
	}

	public LocalDateTime getEndDato() {
		return endDato;
	}

	public String getStatus() {
		return status;
	}

	public double getPris() {
		return pris;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public void setKontor(Utleiekontor kontor) {
		this.kontor = kontor;
	}

	public void setBilKategori(String bilKategori) {
		this.bilKategori = bilKategori;
	}

	public void setStartDato(LocalDateTime startDato) {
		this.startDato = startDato;
	}

	public void setEndDato(LocalDateTime endDato) {
		this.endDato = endDato;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}
	@Override
	public String toString() {
		return "Reservasjon [kunde=" + kunde + ", \nkontor=" + kontor + ", \nbilKategori=" + bilKategori + ", \nstartDato="
				+ startDato + ", \nendDato=" + endDato + ", \nstatus=" + status + ", \npris=" + pris + "]";
	}
	
	
}
