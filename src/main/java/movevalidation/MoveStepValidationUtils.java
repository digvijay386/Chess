package movevalidation;

import model.ChessPieceType;

import java.util.List;
import java.util.Map;

public class MoveStepValidationUtils {

    private MoveStepValidationUtils() {}

    private static final Map<ChessPieceType, List<SubMoveValidations>>
            chessPieceTypeToMoveValidationStrategiesMap = Map.of(ChessPieceType.ROOK,
            List.of(SubMoveValidations.DIRECTION_VALIDATION, SubMoveValidations.BOARD_STATE_VALIDATION));

    public static List<SubMoveValidations> getSubMoveValidations(final ChessPieceType chessPieceType) {
        return chessPieceTypeToMoveValidationStrategiesMap.get(chessPieceType);
    }

}
