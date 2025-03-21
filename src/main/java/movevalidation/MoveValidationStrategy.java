package movevalidation;

import model.ChessPiece;
import model.Position;

public interface MoveValidationStrategy {
    boolean isMoveValid(final ChessPiece chessPiece,
                        final Position initialPosition,
                        final Position finalPosition);
}
