package com.hellbean.blindfold;

import java.util.List;
import java.util.ArrayList;

public class Knight extends Piece {
    private static MoveDelta[] moveDeltas = {  new MoveDelta(2, 1), new MoveDelta(1, 2), new MoveDelta(-2, 1), new MoveDelta(2, -1), new MoveDelta(-2, -1), new MoveDelta(-1, 2), new MoveDelta(-1, -2), new MoveDelta(1, -2) };
    @Override
    public List<Square> getMoves(Board board) {
        List<Square> squares = new ArrayList<>();

        int currRank = getCurrentSquare().getRank();
        int currFile = getCurrentSquare().getFile();

        for (int i = 0; i < moveDeltas.length; i++) {
            int newFile = currFile + moveDeltas[i].getFileOffset(1);
            int newRank = currRank + moveDeltas[i].getRankOffset(1);

            Square target = board.getSquare(newRank, newFile);
            if (target.getPiece() == null || !target.getPiece().getColor().equals(getColor())) {
                squares.add(target);
            }
        }

        return squares;
    }
}
