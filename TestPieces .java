public class TestPieces { 
	public static void main(String[] args){
	ChessPiece Piece= new ChessPiece();
		Piece.setPosition( 4,3);
		Piece.setColor("white");
		Piece.setType("queen");
		Piece.pieceInfo();
	
	ChessPiece Piece= new ChessPiece();
		Piece.setPosition( 3,2);
		Piece.setColor("black");
		Piece.setType("pawn");
		Piece.pieceInfo();
	}
}