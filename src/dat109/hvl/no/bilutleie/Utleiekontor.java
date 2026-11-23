package dat109.hvl.no.bilutleie;

import java.util.Objects;

/**
 * utleiekontor til bilutleieselskap 
 */
public class Utleiekontor {

	private int kontorNummer;
	private String adresse;
	private String mobilNummer;
	
	/**
	 * 
	 * @param kontorNummer unikk kontoNummer til kontoret
	 * @param adresse Adressen til kontoret
	 * @param mobilNummer Telefon Nummer
	 */
	public Utleiekontor(int kontorNummer, String adresse, String mobilNummer) {
		this.kontorNummer = kontorNummer;
		this.adresse = adresse;
		this.mobilNummer = mobilNummer;
	
	}
	
	//gettere
	public int getKontorNummer() {
		return kontorNummer;
	}
	public String getAdresse() {
		return adresse;
	}
	public String getMobilNummer() {
		return mobilNummer;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Utleiekontor that)) return false;
		return kontorNummer == that.kontorNummer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(kontorNummer);
	}

	@Override
	public String toString() {
		return "Utleiekontor [kontorNummer=" + kontorNummer + ", adresse=" + adresse + ", mobilNummer=" + mobilNummer
				+ "]";
	}
	
	
}
