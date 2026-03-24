package chenille;

public class Anneau {
    private int x,y;

    public Anneau (int x, int y){
        this.x = x;
        this.y = y;
    }
    public void deplacer(Anneau a){
        this.x = a.x();
        this.y = a.y();
    }
    public int x() {
        return this.x; // A modifier
    }
    public int y() {
        return this.y;
    }
}