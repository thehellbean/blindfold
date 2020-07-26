package com.hellbean.blindfold;

import java.util.List;

public class Rook extends Piece {
    private MoveDelta[] moveDeltas = { new MoveDelta(0, 1), new MoveDelta(0, -1), new MoveDelta(1, 0), new MoveDelta(-1, 0) };

    @Override
    public List<Square> getMoves(Board board) {
        return getMovesFromDeltas(moveDeltas, board);
    }
}
