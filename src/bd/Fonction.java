package bd;


import java.sql.ResultSet;
import java.util.Vector;

import obj.*;
import user.*;


public class Fonction {
    public static Vector<Livre> getAlllivre(){
        Vector<Livre> l = new Vector<>();
        try {
            Database d = new Database();
            ResultSet rs = d.select("SELECT * FROM livre");
            while (rs.next()) {
                String titre = rs.getString("titre");
                String auteur = rs.getString("auteur");
                String genre = rs.getString("genre");
                int annee = rs.getInt("annee");
                int estDispo = rs.getInt("estDispo");
                Livre li = new Livre(titre, auteur, genre, annee, estDispo);
                l.add(li);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return l;
    }
      public static Vector<Personne> getMembre(){
        Vector<Personne> p = new Vector<>();
        try {
            Database d = new Database();
            ResultSet rs = d.select("SELECT * FROM utilisateur");
            while (rs.next()) {
                int id = rs.getInt("id");
                String pseudo = rs.getString("pseudo");
                String mdp = rs.getString("mot_de_passe");
                int estEligible= rs.getInt("estEligible");

                Personne pe = new Personne(id,pseudo, mdp, estEligible);
                p.add(pe);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return p;
    }
    public static int getId(String pseudo){
          int id = 0;
        try {
            Database d = new Database();
            ResultSet rs = d.select("SELECT id FROM utilisateur WHERE pseudo = '" + pseudo + "'");
            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
       
        return id;
    }
    public static boolean verifMembre(String pseudo , String mdp){
        boolean b = false;
        Vector<Personne> p = getMembre();
        for (Personne pe  : p) {
            if (pe.getPseudo().equals(pseudo) && pe.getMdp().equals(mdp)) {
                System.out.println("Autorise");
                b =  true;
            }
            else{
               continue;
               
            }
            
        }
        return b;
    }
}

    

