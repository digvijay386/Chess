package model;

import lombok.Builder;
import movevalidation.MoveStepValidationUtils;
import movevalidation.SubMoveValidations;

import java.util.List;

@Builder
public record ChessPiece(
        PlayerColor playerColor,
        ChessPieceType chessPieceType) {

    public boolean isMoveValid(final Position initialPosition,
                               final Position proposedPosition) {
        final List<SubMoveValidations> subMoveValidations =
                MoveStepValidationUtils.getSubMoveValidations(chessPieceType);


        return true;
    }
}

