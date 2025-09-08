package test;
import obj.*;

import java.util.Vector;

import bd.*;
import user.*;

public class Main {
    public static void main(String[] args) {
        // Personne p =new Personne("admin", null, null);
        // Personne p2 = new Personne("Nekena", null, null);
        // int id = p.getId();
        // System.out.println(id);
        // Vector<Livre> li = Fonction.getAlllivre();
        // System.out.println("Voici tous les Membres");
        // for (Livre l : li) {
        //     System.out.println("Titre : " + l.getTitre());
            
        // }

        //   Vector<Personne> li = Fonction.getMembre();
        // System.out.println("Voici tous les Membres");
        // for (Personne l : li) {
        //     System.out.println("Titre : " + l.getPseudo());
        // }

        //verification
        Fonction.verifMembre("fory", "1234");

    }
    
    
}
