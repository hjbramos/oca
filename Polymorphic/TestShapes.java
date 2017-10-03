interface Animatable {
  public abstract void animate();
}

class GameShape {
  public void displayShape() {
    System.out.println("displaying shape");
  }
}

class PlayerPiece extends GameShape implements Animatable {
  public void movePiece() {
    System.out.println("moving game piece");
  }

  public void animate() {
    System.out.println("animating...");
  }
}

class PlayerPiece2 extends PlayerPiece {
  public void animate() {
    System.out.println("animating 2 ...");
  }
}

public class TestShapes {
  public static void main (String[] args) {

    PlayerPiece shape = new PlayerPiece();
    GameShape game = shape;
    shape.displayShape();
    game.displayShape();

    Object o = shape;
    // o.displayShape();  error: cannot find symbol (compilation error)

    Animatable anima = shape;
    // anima.displayShape(); //  error: cannot find symbol (compilation error)

    if (shape instanceof GameShape) {
      System.out.println("shape is instance of GameShape.");
    }

    if (shape instanceof Object) {
      System.out.println("shape is instance of Object.");
    }

    if (shape instanceof Animatable) {
      System.out.println("shape is instance of Animatable.");
    }

    //game.animate(); // error: cannot find symbol (compilation error)

    //any class from any inheritance tree can also implement Animatable
    PlayerPiece2 shape2 = new PlayerPiece2();
    shape2.animate();

  }
}
