##WEEKEND HOMEWORK

####TASK 1

Napraviti GUI aplikaciju koja se bavi raspodjelom file-ova u foldere. Aplikacija mora imati dugme koje 

otvori Browse prozor, tj. prozor gdje idete po direktorijima i odaberete neki file. Selektirani file se 

zatim parsira i gleda se njegova ekstenzija. 

Ukoliko je selektirani file slika (png, jpg, bmp, gif i slično) onda staviti u folder Pictures. U slučaju 

da je audio zapis (mp3, flac, wmv i slično) onda staviti u folder Audio. Ukoliko je video (mp4, avi, mkv

i slično) onda staviti u folder Video. Dokumenti (doc, txt, xlsx i slično) idu u folder Documents. Svi 

ostali file-ovi idu u Other folder.

Po pojmom „idu u X folder“ podrazumijeva se da se selektirani file fizički prebaci (može i da kopira) u 

taj direktorij. Korisnik će izabrati gdje će se glavni direktorij nalaziti (pod glavnim misli se na 

direktorij koji u sebi sadrži ostale direktorije, poput Documents, Pictures i ostale).

Program sadrži i panel koji prikazuje koji su sve file-ovi u tim folderima, tj. spisak file-ova koji se 

trenutno nalaze u tom direktoriju zajedno sa imenom direktorija. Ovo bi se moglo uraditi tako što se 

u neki drugi file bilježi kada se nova datoteka doda preko Browse opcije i onda se čita iz tog file-a kada 

se ponovo pokrene aplikacija.

Brisanje file-ova je također moguće tako što se pritisne dugme na pomenutom panelu. Zbog toga je 

potrebno sve te file-ove opisati u jednoj klasi, nazvati je, recimo, UploadedFile, koja ima atribute 

poput imena, ekstenzije i veličine file-a, a pored toga i objekat tipa File.