package movevalidation;

import model.ChessPiece;
import model.ChessPieceType;
import model.Position;

public class DirectionValidationStrategy implements MoveValidationStrategy {

    @Override
    public boolean isMoveValid(final ChessPiece chessPiece,
                               final Position initialPosition,
                               final Position finalPosition) {

        if (ChessPieceType.ROOK.equals(chessPiece.chessPieceType())) {
            final int initial_x = initialPosition.x();
            final int initial_y = initialPosition.y();
            final int final_x = finalPosition.x();
            final int final_y = finalPosition.y();

            return (initial_y == final_y || initial_x == final_x);
        }

        return false;
    }

}
