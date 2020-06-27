package com.dp.builder.chess;

import java.util.Date;
 
public class ChessGame {
	private Player white;
	private Player black;
	private Player start;
	private ChessBorad borad;
	
	private String level;
	private Date gameStartDate;
	private Date gameEndDate;
	
	public ChessGame(Builder builder) {
		this.level = level;
		this.gameStartDate = gameStartDate;
		this.gameEndDate = gameEndDate;
	}
	
	public Player getWhite() {
		return white;
	}
	public void setWhite(Player white) {
		this.white = white;
	}
	public Player getBlack() {
		return black;
	}
	public void setBlack(Player black) {
		this.black = black;
	}
	public Player getStart() {
		return start;
	}
	public void setStart(Player start) {
		this.start = start;
	}
	public ChessBorad getBorad() {
		return borad;
	}
	public void setBorad(ChessBorad borad) {
		this.borad = borad;
	}
	
	public static class Builder{
		private String level;
		private Date gameStartDate;
		private Date gameEndDate;
		
		public Builder level(String level) {
			this.level =level;
			return this;
		}
		public Builder gameStartDate(Date gameStartDate) {
			this.gameEndDate = gameStartDate;
			return this;
		}
		public Builder gameEndDate(Date gameEndDate) {
			this.gameEndDate = gameEndDate;
			return this;
		}
		public ChessGame build() {
			return new ChessGame(this);
		}
	}

	@Override
	public String toString() {
		return level+" "+black+" "+gameStartDate+" "+gameEndDate;
	}
	public static void main(String[] args) {
		ChessGame game = new ChessGame.Builder().gameStartDate(new Date()).gameEndDate(new Date()).level("Level1").build();
		game.setBlack(new Player());
		game.setWhite(new Player());
		System.out.println("Game Object: "+game);
	}
	
}
