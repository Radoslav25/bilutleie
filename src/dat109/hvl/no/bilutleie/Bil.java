package dat109.hvl.no.bilutleie;
/**
 * bil tilgjngelighet til utleie
 */
public class Bil {

	private String regNummer;
	private String merke;
	private String modell;
	private String farge;
	private String utleieGruppe;
	private boolean erLedig;
	private int kmStand;
	private Utleiekontor location;
	
	public Bil(String regNummer, String merke, String modell, String farge, String utleieGruppe, boolean erLedig,
			int kmStand, Utleiekontor location) {
		this.regNummer = regNummer;
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.utleieGruppe = utleieGruppe;
		this.erLedig = erLedig;
		this.kmStand = kmStand;
		this.location = location;
	}
	public String getRegNummer() {
		return regNummer;
	}
	public String getMerke() {
		return merke;
	}
	public String getModell() {
		return modell;
	}
	public String getFarge() {
		return farge;
	}
	public String getUtleieGruppe() {
		return utleieGruppe;
	}
	public boolean isErLedig() {
		return erLedig;
	}
	public int getKmStand() {
		return kmStand;
	}
	public Utleiekontor getLocation() {
		return location;
	}
	public void setRegNummer(String regNummer) {
		this.regNummer = regNummer;
	}
	public void setMerke(String merke) {
		this.merke = merke;
	}
	public void setModell(String modell) {
		this.modell = modell;
	}
	public void setFarge(String farge) {
		this.farge = farge;
	}
	public void setUtleieGruppe(String utleieGruppe) {
		this.utleieGruppe = utleieGruppe;
	}
	public void setErLedig(boolean erLedig) {
		this.erLedig = erLedig;
	}
	public void setKmStand(int kmStand) {
		this.kmStand = kmStand;
	}
	public void setLocation(Utleiekontor location) {
		this.location = location;
	}

	@Override
	public String toString() {
	    return "Bil{" +
	           "RegNummer='" + regNummer + '\'' +
	           ", Merke='" + merke + '\'' +
	           ", Modell='" + modell + '\'' +
	           ", Farge='" + farge + '\'' +
	           ", \n	Gruppe='" + utleieGruppe + '\'' +
	           ", Ledig=" + erLedig +
	           ", KmStand=" + kmStand +
	           '}';
	}

	
	
}