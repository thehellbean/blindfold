package com.hellbean.blindfold;

import java.util.List;
import java.util.ArrayList;

public class Pawn extends Piece {
    @Override
    public List<Square> getMoves(Board board) {
        List<Square> returnSquares = new ArrayList<>();
        int currRank = getCurrentSquare().getRank();
        int currFile = getCurrentSquare().getFile();

        int movementDirection = getColor().equals(Color.WHITE) ? 1 : -1;
        int nextRank = currRank + movementDirection;

        if (!board.hasPiece(nextRank, currFile)) {
            returnSquares.add(board.getSquare(nextRank, currFile));
        }

        if (board.hasPiece(nextRank, currFile + 1) && !board.getSquare(nextRank, currFile + 1).getPiece().getColor().equals(getColor())) {
            returnSquares.add(board.getSquare(nextRank, currFile + 1));
        }

        if (board.hasPiece(nextRank, currFile - 1) && !board.getSquare(nextRank, currFile - 1).getPiece().getColor().equals(getColor())) {
            returnSquares.add(board.getSquare(nextRank, currFile - 1));
        }

        return returnSquares;
    }
}
