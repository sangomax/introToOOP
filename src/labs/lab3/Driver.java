package labs.lab3;

import java.util.ArrayList;

public class Driver {

    public static final int PAWN_VALUE = 1;
    public static final int KNIGHT_VALUE = 2;
    public static final int BISHOP_VALUE = 3;
    public static final int ROOK_VALUE = 5;
    public static final int QUEEN_VALUE = 9;
    public static final int KING_VALUE = 1000;
    public static final boolean WHITE_PIECE = true;
    public static final boolean BLACK_PIECE = false;

    public static void main(String[] args) {

        ArrayList<Piece> pieces = new ArrayList<>();
//        pieces = createAllPieces();

        Pawn p1 = new Pawn(PAWN_VALUE, WHITE_PIECE, true, new Queen(QUEEN_VALUE, WHITE_PIECE));
        Pawn p2 = new Pawn(PAWN_VALUE, WHITE_PIECE, false, null);
        Pawn p3 = new Pawn(PAWN_VALUE, BLACK_PIECE, false, null);
        Pawn p4 = new Pawn(PAWN_VALUE, BLACK_PIECE, true, new Queen(QUEEN_VALUE, BLACK_PIECE));
        Pawn p5 = new Pawn(PAWN_VALUE, WHITE_PIECE, true, new Knight(KNIGHT_VALUE, WHITE_PIECE));

        pieces.add(p1);
        pieces.add(p2);
        pieces.add(p3);
        pieces.add(p4);
        pieces.add(p5);

        printMoves(pieces);

        System.out.println(p1.equals(p2) + " should return false");
        System.out.println(p1.equals(p4) + " should return false");
        System.out.println(p1.equals(p5) + " should return false");
        System.out.println(p2.equals(p3) + " should return false");
        System.out.println(p4.equals(p5) + " should return false");

    }

    public static ArrayList<Piece> createAllPieces() {
        ArrayList<Piece> pieces = new ArrayList<>();
        boolean[] colors = {WHITE_PIECE, BLACK_PIECE};
        for (boolean color : colors) {
            pieces.add(new King(KING_VALUE, color));
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
