package com.hellbean.blindfold;

public class Square {
    private int rank;
    private int file;
    private Piece piece;

    public Square(int rank, int file) {
        this.rank = rank;
        this.file = file;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }
}
