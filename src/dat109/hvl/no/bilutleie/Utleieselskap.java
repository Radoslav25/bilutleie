package dat109.hvl.no.bilutleie;

import java.util.ArrayList;
import java.util.List;

/**
 * Bil utleie selskap 
 */
public class Utleieselskap {

	private String navn;
	private String mobilNummer;
	private String adresse;
	private List<Utleiekontor>utleiekontorer;
	
	/**
	 * 
	 * @param navn Navn til selskap
	 * @param mobilNummer nummer til selskap
	 * @param adresse Adresse til selskap
	 */
	public Utleieselskap(String navn, String mobilNummer, String adresse) {
		
		this.navn = navn;
		this.mobilNummer = mobilNummer;
		this.adresse = adresse;
		this.utleiekontorer = new ArrayList<>();
		}

	public Utleieselskap() {
		this.utleiekontorer = new ArrayList<>();
	}

	//gettere
	public String getNavn() {
		return navn;
	}

	public String getMobilNummer() {
		return mobilNummer;
	}

	public String getAdresse() {
		return adresse;
	}

	public List<Utleiekontor>getUtleiekontorer() {
		return utleiekontorer;
	}
	public void addUtleiekontor(Utleiekontor kontor) {
		if (utleiekontorer == null) {
			utleiekontorer = new ArrayList<>();
		}
		utleiekontorer.add(kontor);
	}
	
	
}
