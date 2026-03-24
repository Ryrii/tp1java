package chenille;

import geometrie.Direction;

public class Tete {
    private int x,y;
    private Direction direction;

    public Tete (int x, int y){
        this.x = x;
        this.y = y;
        this.direction = Direction.EST;
    }
    public void deplacer(){
        this.x = x+1;
        this.y = y;
    }
    public int x() {
        return this.x; // A modifier
    }
    public int y() {
        return this.y;
    }
    public Direction direction() {
        return this.direction;
    }
}
