package movevalidation;

import model.ChessPiece;
import model.ChessPieceType;
import model.Position;

public class BoardStateValidationStrategy implements MoveValidationStrategy {

    @Override
    public boolean isMoveValid(final ChessPiece chessPiece,
                               final Position initialPosition,
                               final Position finalPosition) {
        if (ChessPieceType.ROOK.equals(chessPiece.chessPieceType())) {

        }
    }
}
