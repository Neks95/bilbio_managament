package obj;
import java.util.Vector;

import user.*;

public class Biblio {
    private Vector<Livre> livreTotal;
    private Vector<Personne> membres;
    private Vector<Emprunt> listeEmprunts;


    public Vector<Emprunt> getListeEmprunts() {
        return listeEmprunts;
    }
    public void setListeEmprunts(Vector<Emprunt> listeEmprunts) {
        this.listeEmprunts = listeEmprunts;
    }
    
    public Biblio(Vector<Livre> livreTotal, Vector<Personne> membres) {
        this.livreTotal = livreTotal;
        this.membres = membres;
    }
    public Vector<Livre> getLivreTotal() {
        return livreTotal;
    }
    public void setLivreTotal(Vector<Livre> livreTotal) {
        this.livreTotal = livreTotal;
    }
    public Vector<Personne> getMembres() {
        return membres;
    }
    public void setMembres(Vector<Personne> membres) {
        this.membres = membres;
    }

   
    
}
