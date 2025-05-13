package org.example;

import java.util.Scanner;

public class Exercice71 {
    public static void main(String[] args) {
        /*Exercice : Voyelle ou consonne
1. Créer une variable caractere
2. Affecter une valeur à la variable caractere
3. A l'aide des structures conditionnelles, déterminer si le caractère
est une consonne ou une voyelle
Saisir un caractère : c
Le caractère saisi est une consonne*/

        String[] voyelles = new String[6];
        voyelles[0] = "a";
        voyelles[1] = "e";
        voyelles[2] = "i";
        voyelles[3] = "o";
        voyelles[4] = "u";
        voyelles[5] = "y";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez le caractere:");
        String caractere = scanner.next();;
        String result = "";
        for (int i = 0; i < voyelles.length; i++) {
            if (!voyelles[i].equals(caractere)) {
                result = "consonne";

            } else {
                result = "voyelle";
            }
        }
        System.out.println("il s'agit d'une "+ result);
    }
}