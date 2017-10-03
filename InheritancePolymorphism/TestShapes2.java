//class GameShape { // error: duplicate class: GameShape (mesmo em arquivo diferente)
    
class GameShape2 {
    public void displayShape() {
        System.out.println("displaying shape");
    }
}

class PlayerPiece2 extends GameShape2 {
    public void movePiece() {
        System.out.println("moving game piece");
    }
}

class TilePiece2 extends GameShape2 {
    public void getAdjacent() {
        System.out.println("getting adjacent tiles");
    }
}

public class TestShapes2 {
    public static void main (String [] args) {
        PlayerPiece2 player = new PlayerPiece2();
        TilePiece2 tile = new TilePiece2();
        doShapes(player);
        doShapes(tile);
    }
    
    public static void doShapes(GameShape2 shape) {
        shape.displayShape();
    }
}