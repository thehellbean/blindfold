package com.hellbean.blindfold;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {
    private MoveDelta[] moveDeltas = { new MoveDelta(1, 1), new MoveDelta(-1, 1), new MoveDelta(1, -1), new MoveDelta(-1, -1) };

    public List<Square> getMoves(Board board) {
        int currRank = this.getCurrentSquare().getRank();
        int currFile = this.getCurrentSquare().getFile();

        List<Square> squares = new ArrayList<>();

        for (int moveIndex = 0; moveIndex < 4; moveIndex++) {
            for (int i = 1; i < 8; i++) {
                int newRank = currRank + moveDeltas[moveIndex].getRankOffset(i);
                int newFile = currFile + moveDeltas[moveIndex].getFileOffset(i);
                
                if (newRank < 8 && newRank > 0 && newFile < 8 && newFile > 0) {
                    Square target = board.getSquare(newRank, newFile);
                    if (target.getPiece() != null) {
                        if (target.getPiece().getColor() != getColor()) {
                            squares.add(target);
                        }
                        break;
                    } else {
                        squares.add(target);
                    }
                } else {
                    break;
                }
            }
        }

        return squares;
    }
}
