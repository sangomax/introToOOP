package labs.lab3;

import java.util.ArrayList;

public class Controller {

    public static final int PAWN_VALUE = 1;
    public static final int KNIGHT_VALUE = 2;
    public static final int BISHOP_VALUE = 3;
    public static final int ROOK_VALUE = 5;
    public static final int QUEEN_VALUE = 9;
    public static final int KING_VALUE = 1000;
    public static final boolean WHITE_PIECE = true;
    public static final boolean BLACK_PIECE = false;

    public static ArrayList<Piece> createAllPieces() {
        ArrayList<Piece> pieces = new ArrayList<>();
        boolean[] colors = {WHITE_PIECE, BLACK_PIECE};
        for (boolean color : colors) {
            pieces.add(new King(color));
            pieces.add(new Queen(QUEEN_VALUE, color));
            pieces.add(new Bishop(BISHOP_VALUE, color));
            pieces.add(new Bishop(BISHOP_VALUE, color));
            pieces.add(new Knight(KNIGHT_VALUE, color));
            pieces.add(new Knight(KNIGHT_VALUE, color));
            pieces.add(new Rook(ROOK_VALUE, color));
            pieces.add(new Rook(ROOK_VALUE, color));
            pieces.add(new Pawn(PAWN_VALUE, color, false, null));
            pieces.add(new Pawn(PAWN_VALUE, color, false, null));
            pieces.add(new Pawn(PAWN_VALUE, color, false, null));
            pieces.add(new Pawn(PAWN_VALUE, color, false, null));
            pieces.add(new Pawn(PAWN_VALUE, color, false, null));
            pieces.add(new Pawn(PAWN_VALUE, color, false, null));
            pieces.add(new Pawn(PAWN_VALUE, color, false, null));
            pieces.add(new Pawn(PAWN_VALUE, color, false, null));
        }
        return pieces;
    }

    public static void printMoves(ArrayList<Piece> pieces) {
        for (Piece piece : pieces) {
            piece.move();
        }
    }

}
