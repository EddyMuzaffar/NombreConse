package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        boolean validOption = false;
        ArrayList<Integer> myTab = new ArrayList<>();
        while(!validOption) { //Verife que les nombre entrées sont bien des entier
            try {
                System.out.println("Rentrer vos nombres choisis : ");
                String input = scanner.nextLine();
                String[] numbersString = input.split(" "); // Séparer la chaine de caractère avec un espace puis range dans un tableau string
                int[] numbers = new int[ numbersString.length ]; // Crée un tableau int de la taille du tableau de chaîne précedent
                for(int i = 0; i < numbersString.length; i++){
                    numbers[i] = Integer.parseInt( numbersString[i] );
                    myTab.add(numbers[i]); // Range les valeurs entrées dans un tableau
                }
                validOption = true; // Condition pour sortir de la boucle
            }catch (NumberFormatException ex){
                System.out.println("Veuillez choisir des nombre entier");
            }
        }

        Collections.sort(myTab); // Fonction qui trie les valeurs rentré par ordre croissants
        System.out.println(myTab);
        int f = 0;
        for(int i = 0; i < (myTab.size() - 1); i++){ // Boucle pour incrémenter la valeur f à chaque nombre qui ce suit
            int  j= i +1;
            if ((myTab.get(i) + 1) == myTab.get(j)){
                f++;
            }
        }
        if (f == (myTab.size() - 1)){ //Verifie si la valeur f est égale au nombre de valeur dans le tableau
            System.out.println("Les nombres sont consécutifs"); // Si oui, les nombre sont consécutifs
        }else
        {
            System.out.println("Les nombres ne sont pas consécutifs"); // Sinon ils ne sont pas consédutif
        }
    }
}
