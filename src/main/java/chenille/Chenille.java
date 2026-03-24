package chenille;

import geometrie.Direction;

import java.util.List;

public class Chenille {
    private Tete tete;
    private Anneau[] anneaux;

    public Chenille(int nbAnneaux, int xTete, int yTete) {
        tete = new Tete(xTete,yTete);
        anneaux = new Anneau[nbAnneaux];
        for (int i = 0; i < nbAnneaux; i++) {
            anneaux[i] = new Anneau(xTete-i-1,yTete);
        }
    }

    public void deplacer(int i, int i1) {
        tete.deplacer();
        for (int j = anneaux.length-1; j <= 0; j--) {
            anneaux[j].deplacer(anneaux[j-1]);
            System.out.println(anneaux[j].x());
            System.out.println(anneaux[j-1].x());
        }
    }

    // retourne une COPIE de la tete de la chenille
    public Tete tete() {
        return this.tete; // A modifier
    }

    // retourne une COPIE des anneaux de la chenille
    public Anneau[] anneaux() {
        return this.anneaux; // A modifier
    }
}
