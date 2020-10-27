package labs.lab3;

import java.util.ArrayList;
import static labs.lab3.Controller.*;

public class Driver {

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

        System.out.println(p1.equals(p2));//" should return false"
        System.out.println(p1.equals(p4));//" should return false"
        System.out.println(p1.equals(p5));//" should return false"
        System.out.println(p2.equals(p3));//" should return false"
        System.out.println(p4.equals(p5));//" should return false"

    }
}
