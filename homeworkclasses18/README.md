Za ovu svrhu vam je dostavljena klasa `SortedIntList` koja sadrži već neke manje ili više implementirane metode.

##Zadaci:

####1. 
Implementirajte metodu `add(int n)` tako da doda broj `n` u linkanu listu uzimajući u obzir da linkana lista nakon pokretanja treba biti sortirana u rastućem redoslijedu
* ako vam se ovaj zadatak pokaže kao suviše komplikovan, a želite pokušati uraditi ostale zadatke, implementirajte `add(n)` metodu tako da dodaje element na kraj liste. Slične primjere smo već radili na GitHub-u.

####2. 
Dovršite implementaciju metode `toArray()` tako da vraća niz koji sadrži sve elemente iz liste u ispravnom redoslijedu.

####3. 
*(bonus)* Prepišite metodu `getLength()` tako da računa dužinu liste reukurzivno umjesto iterativno.
* **HINT**: Sama metoda `getLength()` ne treba da bude rekurzivna, već će vam trebati pomoćna metoda koja prima argument tipa `Node`. Ne zaboravite da je linkana lista definisana rekurzivno: svaki čvor linkane liste pokazuje na prvi čvor ostatka linkane liste :)
* *(malo manji bonus)* Ako ne uspijete implementirati rekurzivno brojanje elemenata, još uvijek možete spasiti obraz ako prepišete `getLength()` metodu tako da koristi `for` umjesto `while` petlje. Za ovo imate par hintova u kôdu objavljenom nakon današnjeg predavanja.

Pogledajte link u prilogu za ljepše formatiranu postavku zadatka, te primjere kôda koji će vam koristii. Ako zapnete koristite knjigu i primjere kôda s današnjeg predavanja koji su komentarisani na GitHub-u.