package com.dp.builder.chess;

public class Pawn extends ChessPiece{

	@Override
	public ChessPiece getPiece() {
		return new Pawn();
	}

}
