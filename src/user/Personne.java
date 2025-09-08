package user;
import java.sql.ResultSet;
import java.util.Vector;
import obj.*;
import bd.*;

public class Personne {
    private  int id;
    private String pseudo;
    private int eligible;
    private String mdp;


    public String getMdp() {
        return mdp;
    }


    public Personne(int id ,String pseudo ,String mdp, int eligible) {
        this.id = id;
        this.pseudo = pseudo;
        this.eligible = eligible;
        this.mdp = mdp;
    }

    
    public  int getId() {
        return id;
    }
    public void setId(String pseudo) {
        int ide = Fonction.getId(pseudo);
        id = ide;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getEligible() {
        return eligible;
    }

    public void setEligible(int eligible) {
        this.eligible = eligible;
    }





    // public void emprunterLivre(Livre l){
    //     if (l.getEstDispo().equals(true)) {
    
            
    //     }

    // }
        
        
        
    

 
    
    
}
