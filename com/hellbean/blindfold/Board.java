package com.hellbean.blindfold;

import java.util.List;

public class Board {
    private List<List<Square>> boardState;

	public List<List<Square>> getBoardState() {
		return boardState;
	}

	public void setBoardState(List<List<Square>> boardState) {
		this.boardState = boardState;
	}

    public Square getSquare(int rank, int file) {
        return this.boardState.get(file).get(rank);
    }
}
