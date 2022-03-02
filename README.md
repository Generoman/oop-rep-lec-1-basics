## Hvordan laste ned prosjektet:

### Metode 1:
* Trykk på den grønne "Code"-knappen oppe til høyre på GitHub
* Velg `Download ZIP`
* Pakk ut ZIP-filen i en egenvalgt mappe, og åpne prosjektet i IntelliJ

### Metode 2:
* Trykk på den grønne "Code"-knappen oppe til høyre på GitHub
* Trykk på knappen til høyre for linken
* Velg `New -> Project from Version Control...` i IntelliJ
* Lim inn linken i URL-feltet og velg mappa hvor prosjektet skal lagres

## Ordliste:
* Class/Klasse:
  * En slags blueprint på hvordan et objekt skal oppføre seg og hvilken informasjon det skal inneholde
  * Kan sees på som en egendefinert datatype
  * Navngis med stor forbokstav
* Object/Objekt:
  * En verdi av en spesifisert klasse (*instansiert* klasse)
  * Hvis klassen er `Skrivebord`, så er skrivebordet på rommet mitt et objekt av den klassen
  * Et objekt er en *instance/instans* av en klasse
* Fields:
  * Variabler som tilhører en klasse
  * Kan ha ulike verdier for ulike objekter av samme klasse
  * Navngis med liten forbokstav
  * Kan være `public` eller `private` (eller `protected` / `default`, men det overser vi nå)
  * Man får tilgang på et `public` field ved å skrive `objektNavn.fieldNavn`
  * For private fields må man bruke *gettere* og *settere* for å hente de inn eller forandre de
  * Merk at fields i en klasse også kan inneholde objekter!
* Methods/Metoder:
  * Kan sammenlignes med funksjoner i JavaScript
  * Tilhører en klasse, på samme måte som fields
  * Navngis med liten forbokstav
  * Kjøres ved å skrive `objektNavn.metodeNavn()`
  * Kan også være `public` eller `private` (eller `protected` / `default`, men det overser vi nå)
* `main`-metoden:
  * Kan sees på som inngansporten til programmet/applikasjonen vi skriver
  * Uten en `main`-metode, vet ikke Java hvor programmet skal starte
  * Kan ligge i en hvilken som helst klasse, trenger ikke å være i en `Main`- eller `Program`-klasse
  * Tips: I IntelliJ kan man skrive "main" og trykke Enter for å få hele teksten `public static void main(String[] args {}`
* `public`-nøkkelordet:
  * Betyr at et field eller en metode er tilgjengelig overalt, så lenge det fins et objekt av klassen fieldet/metoden tilhører
* `private`-nøkkelordet:
  * Betyr at et field eller en metode bare er tilgjengelig innenfor klassen den tilhører (se kodeeksempel)
* Getters/Gettere:
  * Spesielle metoder som brukes for å hente ut verdiene i `private` fields 
  * Ikke alle `private` fields trenger gettere
  * Et `private` field med kun getter og ingen setter regnes som *read only*
* Setters/Settere:
  * Spesielle metoder som brukes for å forandre verdiene til `private` fields
  * Ikke alle `private` fields trenger settere
  * Et `private` field med kun setter og ingen getter regnes som *write only*
* Constructors/Konstruktører:
  * Spesielle metoder for å opprette et objekt av en gitt klasse (*instansiering*)
  * Skal alltid ha samme navn som klassen, med stor forbokstav
  * Brukes sammen med `new`-nøkkelordet (se kodeeksempel)
  * Tar ofte inn argumenter for å gi verdier til fields
  * En klasse kan ha mer enn en konstruktør (se kodeeksempel)
  * Om man ikke lager en konstruktør, vil en klasse alltid ha en tom konstruktør (ingen parametere)
  * Om man lager minst en konstruktør, vil den tomme konstruktøren ikke lenger finnes, men kan opprettes manuelt
* `new`-nøkkelordet:
  * Brukes når man skal opprette et objekt av en klasse gjennom en konstruktør (se kodeeksempel)
* Enum:
  * En spesiell type klasse
  * Brukes til egendefinerte lister av verdier (se kodeeksempel)
  * Hentes ved å skrive `NavnPåEnumKlasse.verdienManVilHa`

#### Mindre viktig:
* Instantiation/Instansiering:
  * Et fancy ord for å opprette et objekt av en klasse
* Encapsulation:
  * Handler om å pakke inn verdier (fields) og funksjonalitet (metoder) i en modul (klasse)
  * Også kjent som "data hiding"
  * Grunnen til at man f.eks. bruker `private`-nøkkelordet, getters, og setters
  * Et viktig grunnkonsept i OOP
  * Streng talt ikke viktig å huske ordet for å bestå emnet
