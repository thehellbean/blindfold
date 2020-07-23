package com.hellbean.blindfold;

import java.util.List;

public abstract class Piece {
    private Color color;
    private Square currentSquare;
    abstract public List<Square> getMoves();
}
