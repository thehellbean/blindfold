package com.hellbean.blindfold;

import java.util.ArrayList;
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

    public List<Square> getMovesFromDeltas(MoveDelta[] moveDeltas, Board board) {
        int currRank = this.getCurrentSquare().getRank();
        int currFile = this.getCurrentSquare().getFile();

        List<Square> squares = new ArrayList<>();

        for (int moveIndex = 0; moveIndex < moveDeltas.length; moveIndex++) {
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
