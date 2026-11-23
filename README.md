## Key Classes
- Utleieselskap and Utleiekontor - rental company and branch offices
-  Bil - Vehicle details, rental group (A-D), availability, and mileage
-  Kunde - Customer information
-  Reservasjon - Booking details, availability check, and daily price calculation
-  Utleie and Retur - Active rental and return tracking
-  Betaling - Payment record
-  SystemAdm - core system operations for reservations, pickups, and returs
-  Main - sample end-to-end rental and return flow

## How to Run
Run Main.java

## Sample Output
```text
Reservasjon opprettet: Reservasjon [kunde=Kunde [fornavn=John, etternavn=Doe, adresse=Gate123, 5800 Bergen, mobilNummer=92831294, kredittKortInfo=3333222299991111], 
kontor=Utleiekontor [kontorNummer=1, adresse=Gate12, 5800 Bergen, mobilNummer=1234523], 
bilKategori=A, 
startDato=2025-03-01T09:00, 
endDato=2025-03-07T09:00, 
status=Pending, 
pris=3000.0]
Tot pris: 3000.0
Sjekker bil: AB1232 - Gruppe: A - Lokasjon: 1 - Ledig: true
Etter utlevering: Bil{RegNummer='AB1232', Merke='Toyota', Modell='Corolla', Farge='red', 
        Gruppe='A', Ledig=false, KmStand=50000}
Betaling: Betaling [pris=3000.0, betalingMetode=kredittKort, utleie=Utleie [kunde=Kunde [fornavn=John, etternavn=Doe, adresse=Gate123, 5800 Bergen, mobilNummer=92831294, kredittKortInfo=3333222299991111], bil=Bil{RegNummer='AB1232', Merke='Toyota', Modell='Corolla', Farge='red', 
        Gruppe='A', Ledig=true, KmStand=52000}, regNummer=AB1232, kmStand=50000, startDato=2025-03-01T09:00, sluttDato=2025-03-07T09:00, forventetReturDato=2025-03-07T09:00, betalingStatus=Betalt]]
Etter retur: Bil{RegNummer='AB1232', Merke='Toyota', Modell='Corolla', Farge='red', 
        Gruppe='A', Ledig=true, KmStand=52000}
