package dat109.hvl.no.bilutleie;



public class Betaling {

	private double pris;
	private String betalingMetode;
	private Utleie utleie;
	
	public Betaling(double pris, String betalingMetode, Utleie utleie) {
		this.utleie = utleie;
		this.pris = pris;
		this.betalingMetode = betalingMetode;
	}

	public double getPris() {
		return pris;
	}

	public String getBetalingMetode() {
		return betalingMetode;
	}

	public Utleie getUtleie() {
		return utleie;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}

	public void setBetalingMetode(String betalingMetode) {
		this.betalingMetode = betalingMetode;
	}

	public void setUtleie(Utleie utleie) {
		this.utleie = utleie;
	}

	@Override
	public String toString() {
		return "Betaling [pris=" + pris + ", betalingMetode=" + betalingMetode + ", utleie=" + utleie + "]";
	}
	
	
}
