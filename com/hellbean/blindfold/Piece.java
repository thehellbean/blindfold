package com.hellbean.blindfold;

import java.util.List;

public abstract class Piece {
    private Color color;
    private Square currentSquare;
    abstract public List<Square> getMoves(Board board);

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Square getCurrentSquare() {
        return currentSquare;
    }

    public void setCurrentSquare(Square currentSquare) {
        this.currentSquare = currentSquare;
    }
}

class MoveDelta {
    int rankDelta;
    int fileDelta;

    public MoveDelta(int rankDelta, int fileDelta) {
        this.rankDelta = rankDelta;
        this.fileDelta = fileDelta;
    }

    public int getRankOffset(int multiplier) {
        return this.rankDelta * multiplier;
    }

    public int getFileOffset(int multiplier) {
        return this.fileDelta * multiplier;
    }
}
