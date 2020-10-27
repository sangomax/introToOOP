package labs.lab3;

public abstract class Piece {

    private int value;

    private boolean isWhite;

    public Piece(int value, boolean isWhite) {
        this.value = value;
        this.isWhite = isWhite;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public abstract void move();

    @Override
    public boolean equals(Object obj) {
        Piece pawn = (Piece) obj;
        return this.getValue() == pawn.getValue() && this.isWhite() == pawn.isWhite();
    }

    @Override
    public String toString() {
        return "Piece{" +
                "value=" + value +
                ", isWhite=" + isWhite +
                '}';
    }
}
