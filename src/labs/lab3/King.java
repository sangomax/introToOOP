package labs.lab3;

import static labs.lab3.Controller.KING_VALUE;

public class King extends Piece{

    public King(boolean isWhite) {
        super(KING_VALUE, isWhite);
    }

    @Override
    public void move() {
        System.out.println("One square");
    }

    @Override
    public String toString() {
        return "King{value='" + this.getValue() + '\'' + '}';
    }
}
