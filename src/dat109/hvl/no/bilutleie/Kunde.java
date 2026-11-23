package dat109.hvl.no.bilutleie;

public class Kunde {

	private String fornavn;
	private String etternavn;
	private String adresse;
	private String mobilNummer;
	private String kredittKortInfo;
	
	/**
	 * 
	 * @param fornavn
	 * @param etternavn
	 * @param adresse
	 * @param mobilNummer
	 * @param kredittKortNummer
	 */
	public Kunde(String fornavn, String etternavn, String adresse, String mobilNummer, String kredittKortInfo) {
		super();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.adresse = adresse;
		this.mobilNummer = mobilNummer;
		this.kredittKortInfo = kredittKortInfo;
	}
	
	public String getKredittKortInfo() {
		return kredittKortInfo;
	}

	public void setKredittKortInfo(String kredittKortInfo) {
		this.kredittKortInfo = kredittKortInfo;
	}

	//gettere og settere
	public String getFornavn() {
		return fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public String getAdresse() {
		return adresse;
	}
	public String getMobilNummer() {
		return mobilNummer;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public void setMobilNummer(String mobilNummer) {
		this.mobilNummer = mobilNummer;
	}

	@Override
	public String toString() {
		return "Kunde [fornavn=" + fornavn + ", etternavn=" + etternavn + ", adresse=" + adresse + ", mobilNummer="
				+ mobilNummer + ", kredittKortInfo=" + kredittKortInfo + "]";
	}
	
	
	
}
