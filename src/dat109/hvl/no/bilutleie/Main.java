package dat109.hvl.no.bilutleie;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		SystemAdm utleieSys = new SystemAdm();
		utleieSys.lagKontor(1, "Gate12, 5800 Bergen", "1234523");
		utleieSys.lagKontor(2, "Gate132, 25800 Bergen", "21234523");

		Utleiekontor kontor1 = utleieSys.getKontorer().get(0);
		utleieSys.leggTilBil("AB1232", "Toyota", "Corolla", "red", "A", true, 50000, kontor1);

		Kunde kunde = new Kunde("John", "Doe", "Gate123, 5800 Bergen", "92831294", "3333222299991111");

		LocalDateTime startDato = LocalDateTime.of(2025, 3, 1, 9, 0);
		LocalDateTime sluttDato = LocalDateTime.of(2025, 3, 7, 9, 0);
		Reservasjon reservasjon = utleieSys.lagReservasjon(kunde, kontor1, "A", startDato, sluttDato);

		if (reservasjon != null) {
			System.out.println("Reservasjon opprettet: " + reservasjon);
			System.out.println("Tot pris: " + reservasjon.getPris());

			Utleie utleie = utleieSys.utleieBil(reservasjon);
			if (utleie != null) {
				System.out.println("Etter utlevering: " + utleieSys.getBiler().get(0));
				Betaling betaling = utleieSys.returBil(utleie, 52000, reservasjon.getPris(), "kredittKort");
				System.out.println("Betaling: " + betaling);
				System.out.println("Etter retur: " + utleieSys.getBiler().get(0));
			}
		}
	}
}