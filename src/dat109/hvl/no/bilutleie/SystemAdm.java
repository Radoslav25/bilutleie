package dat109.hvl.no.bilutleie;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SystemAdm {

	private List<Utleiekontor>kontorer;
	private List<Bil>biler;
	private List<Reservasjon>reservasjoner;
	private List<Utleie>utleie;
	
	 public SystemAdm() {
	        kontorer = new ArrayList<>();
	        biler = new ArrayList<>();
	        reservasjoner = new ArrayList<>();
	        utleie = new ArrayList<>();
	       
	    }

	 public void lagKontor(int kontorNummer, String adresse, String mobilNummer) {
		 Utleiekontor nykontor = new Utleiekontor(kontorNummer, adresse, mobilNummer);
		 kontorer.add(nykontor);
	 }
	 public void leggTilBil(String regNummer, String merke, String modell, String farge, String utleieGruppe, boolean erLedig, int kmStand, Utleiekontor kontor) {
	        Bil nyBil = new Bil(regNummer, merke, modell, farge, utleieGruppe, erLedig, kmStand, kontor);
	        biler.add(nyBil);
	    }
	 
	 public List<Bil> searchLedigeBiler(Utleiekontor kontor, LocalDateTime startDato, LocalDateTime sluttDato, String utleieGruppe){
		 List<Bil> ledigeBiler = new ArrayList<>();
		 if (kontor == null || utleieGruppe == null) {
			return ledigeBiler;
		}
		 for (Bil bil : biler) {
			if (kontor.equals(bil.getLocation())
					&& bil.isErLedig()
					&& utleieGruppe.equals(bil.getUtleieGruppe())) {
				ledigeBiler.add(bil);
			}
		}
		 return ledigeBiler;
	 }
	 
	 public double prisBeregning(String utleieGruppe, LocalDateTime startDato, LocalDateTime sluttDato) {
		 double dagligPris = switch (utleieGruppe) {
		 case "A" -> dagligPris = 500.0;   
         case "B" -> dagligPris = 700.0; 
         case "C" -> dagligPris = 900.0;   
         case "D" -> dagligPris = 1100.0; 
		 default -> 0.0;
		 };

		 long dager = Math.max(0, Duration.between(startDato, sluttDato).toDays());
		 return dagligPris * dager;
	 }
	 public Reservasjon lagReservasjon(Kunde kunde, Utleiekontor kontor, String utleieGruppe, LocalDateTime startDato, LocalDateTime sluttDato) {
		 List<Bil>ledigeBiler = searchLedigeBiler(kontor, startDato, sluttDato, utleieGruppe);
		 if(!ledigeBiler.isEmpty()) {
			 
			 double pris = prisBeregning(utleieGruppe, startDato, sluttDato);
			 Reservasjon reservasjon = new Reservasjon(kunde, kontor, utleieGruppe, startDato, sluttDato);
			 reservasjon.setPris(pris);
			 reservasjoner.add(reservasjon);
			 return reservasjon;
		 } else {
			 return null;
		 }
	 }
	 public Utleie utleieBil(Reservasjon reservasjon) {
		    if (biler == null || biler.isEmpty()) {
		        System.out.println("Ingen biler tilgjengelig.");
		        return null;
		    }
/**
 * debug
 */
		    Bil valgtBil = null;
		    for (Bil bil : biler) {
		        System.out.println("Sjekker bil: " + bil.getRegNummer() + " - Gruppe: " + bil.getUtleieGruppe() + 
		                           " - Lokasjon: " + bil.getLocation().getKontorNummer() + 
		                           " - Ledig: " + bil.isErLedig());

		        if (!bil.getUtleieGruppe().equals(reservasjon.getBilKategori())) {
		            System.out.println("Bilgruppe stemmer ikke: " + bil.getUtleieGruppe() + " != " + reservasjon.getBilKategori());
		            continue;
		        }

		        if (bil.getLocation().getKontorNummer() != reservasjon.getKontor().getKontorNummer()) {
		            System.out.println("Lokasjon stemmer ikke: " + bil.getLocation().getKontorNummer() + " != " + reservasjon.getKontor().getKontorNummer());
		            continue;
		        }

		        if (!bil.isErLedig()) {
		            System.out.println("Bilen er ikke ledig.");
		            continue;
		        }

		        valgtBil = bil;
		        break;
		    }

		    if (valgtBil != null) {
		        valgtBil.setErLedig(false);
		        reservasjon.setStatus("Confirmed");
				
		        Utleie nyUtleie = new Utleie(
					reservasjon.getKunde(),
					valgtBil,
					valgtBil.getRegNummer(),
					valgtBil.getKmStand(),
					reservasjon.getStartDato(),
					reservasjon.getEndDato(),
					reservasjon.getEndDato());

				utleie.add(nyUtleie);
				return nyUtleie;
		    }

		    System.out.println("Ingen tilgjengelig bil i ønsket kategori eller lokasjon.");
		    return null;
		}
	 
	 public Betaling returBil(Utleie utleieObj, int kmStand, double prisTot, String betalingMetode) {
		if (utleieObj == null) {
			return null;
		}
		Bil bil = utleieObj.getBil();
		if (bil != null) {
			bil.setErLedig(true);
			bil.setKmStand(kmStand);
		}
		utleieObj.setBetalingStatus("Betalt");
		return new Betaling(prisTot, betalingMetode, utleieObj);
	}

	public List<Utleiekontor> getKontorer() {
		return kontorer;
	}

	public List<Bil> getBiler() {
		return biler;
	}

	public List<Reservasjon> getReservasjoner() {
		return reservasjoner;
	}

	public List<Utleie> getUtleie() {
		return utleie;
	}
	 
	
}
