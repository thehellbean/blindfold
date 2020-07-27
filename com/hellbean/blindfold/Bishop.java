package com.hellbean.blindfold;

import java.util.List;

public class Bishop extends Piece {
    private static MoveDelta[] moveDeltas = { new MoveDelta(1, 1), new MoveDelta(-1, 1), new MoveDelta(1, -1), new MoveDelta(-1, -1) };

    @Override
    public List<Square> getMoves(Board board) {
        return getMovesFromDeltas(moveDeltas, board);
    }
}
