package labs.lab3;

public class Pawn extends Piece {

    private boolean promoted;

    private Piece newPiece;

    public Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece) {
        super(value, isWhite);
        if (promoted) {
            promote(newPiece);
        } else {
            this.promoted = promoted;
            this.newPiece = null;
        }
    }

    @Override
    public void move() {
        if (this.promoted) {
            getNewPiece().move();
        } else {
            System.out.println("Forward 1");
        }
    }

    @Override
    public boolean equals(Object obj) {
        Pawn pawn = (Pawn) obj;
        return this.getValue() == pawn.getValue() &&
                this.isWhite() == pawn.isWhite() &&
                this.isPromoted() == pawn.isPromoted() &&
                (
                        (this.isPromoted() == false &&
                                (this.getNewPiece() == null && pawn.newPiece == null)
                        ) || (this.isPromoted() == true &&
                                (this.getNewPiece() != null && pawn.newPiece != null) &&
                                (this.getNewPiece().equals(pawn.newPiece))
                        )
                );
    }

    @Override
    public String toString() {
        return "Pawn{value='" + this.getValue() + '\'' + '}';
    }

    public void promote(Piece newPiece) {
        if (newPiece != null && newPiece.getValue() != 1000 && newPiece.getValue() != 1) {
            setPromoted(true);
            setNewPiece(newPiece);
        }
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public Piece getNewPiece() {
        return newPiece;
    }

    public void setNewPiece(Piece newPiece) {
        this.newPiece = newPiece;
    }
}
