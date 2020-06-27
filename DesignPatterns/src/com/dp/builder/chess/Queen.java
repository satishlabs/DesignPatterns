package com.dp.builder.chess;

public class Queen extends ChessPiece{

	@Override
	public ChessPiece getPiece() {
		return new Queen();
	}

}
