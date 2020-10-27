package labs.lab3;

public class Rook extends Piece{

    public Rook(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Horizontally or vertically");
    }

    @Override
    public String toString() {
        return "Rook{value='" + this.getValue() + '\'' + '}';
    }
}
