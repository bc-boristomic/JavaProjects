##HOMEWORK

####TASK 1 – FILES + WORKER THREADS

Učitati bilo koju tekst datoteku i odrediti koliko se prvo slovo prvog reda ponavlja u cijelom File-u.

Podijeliti posao na više Thread-ova pomoću Producer Consumer metodologije, tako da svaki Thread 

dobije jednu liniju File-a. Program nije osjetljiv na velika i mala slova.


####TASK 2 – BUFFEREDIMAGE + WORKER THREADS

Koristeći Producer Consumer metodologiju učitanu sliku renderati u negativ. Učitati sliku sa računara 

u BufferedImage tako da postoje sve informacije o svakom pikselu. Koristeći te informacije podijeliti 

posao na više Thread-ova (na proizvoljan, ali efikasan način). Svaki Thread mora obrnuti vrijednost 

piksela, tj. vrijednost R, G i B oduzeti od 255. Prikazati pomoću GUI-a rezultat tih operacija.