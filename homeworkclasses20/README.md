##List, set, map

Naime, iz knjige "Introduction to Programming Using Java", u poglavlju 7, u sekciji "Exercises for Chapter 7", zadatak pod brojem 7.
(Sve sedmice, da vam bude lakse :) )

Vas zadatak je da uradite ovaj zadatak koristeći:
1. ArrayList
2. LinkedList
3. TreeSet
4. HashSet
5. Kombinaciju gore navedenih struktura da biste dobili što elegantnije rješenje


#### Task from book
7. Write a program that will read a text file selected by the user, and will make an alphabetical
list of all the different words in that file. All words should be converted to lower case, and
duplicates should be eliminated from the list. The list should be written to an output file
selected by the user. As discussed in Subsection 2.4.4, you can use TextIO to read and
write files. Use a variable of type ArrayList<String> to store the words. It is not easy to
separate a file into words as you are reading it. You can use the following method:
/**
* Read the next word from TextIO, if there is one. First, skip past
* any non-letters in the input. If an end-of-file is encountered before
* a word is found, return null. Otherwise, read and return the word.
* A word is defined as a sequence of letters. Also, a word can include
* an apostrophe if the apostrophe is surrounded by letters on each side.
* @return the next word from TextIO, or null if an end-of-file is
*
encountered
*/
private static String readNextWord() {
char ch = TextIO.peek(); // Look at next character in input.
while (ch != TextIO.EOF && ! Character.isLetter(ch)) {
// Skip past non-letters.
TextIO.getAnyChar(); // Read the character.
ch = TextIO.peek();
// Look at the next character.
}
if (ch == TextIO.EOF) // Encountered end-of-file
return null;
// At this point, we know the next character is a letter, so read a word.
String word = ""; // This will be the word that is read.
while (true) {
word += TextIO.getAnyChar(); // Append the letter onto word.
ch = TextIO.peek(); // Look at next character.
(solution)379
Exercises
if ( ch == ’\’’ ) {
// The next character is an apostrophe. Read it, and
// if the following character is a letter, add both the
// apostrophe and the letter onto the word and continue
// reading the word. If the character after the apostrophe
// is not a letter, the word is done, so break out of the loop.
TextIO.getAnyChar();
// Read the apostrophe.
ch = TextIO.peek();
// Look at char that follows apostrophe.
if (Character.isLetter(ch)) {
word += "\’" + TextIO.getAnyChar();
ch = TextIO.peek(); // Look at next char.
}
else
break;
}
if ( ! Character.isLetter(ch) ) {
// If the next character is not a letter, the word is
// finished, so break out of the loop.
break;
}
// If we haven’t broken out of the loop, next char is a letter.
}
return word;
// Return the word that has been read.
}
Note that this method will return null when the file has been entirely read. You can use
this as a signal to stop processing the input file.