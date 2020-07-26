package com.hellbean.blindfold;

import java.util.List;

public class Queen extends Piece {
    private MoveDelta[] moveDeltas = { new MoveDelta(0, 1), new MoveDelta(0, -1), new MoveDelta(1, 0), new MoveDelta(-1, 0),
        new MoveDelta(1, 1), new MoveDelta(-1, 1), new MoveDelta(1, -1), new MoveDelta(-1, -1) 
    };

    @Override
    public List<Square> getMoves(Board board) {
        return getMovesFromDeltas(moveDeltas, board);
    }
}
