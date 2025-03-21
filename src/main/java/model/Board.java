package model;

import java.util.Optional;

public class Board {
     public static Optional<ChessPiece> getChessPiece(final Position position) {
        return Optional.empty();
    }

    public static boolean doesAPieceExistInTheDimensionRange(final Position initialPosition,
                                                             final Position finalPosition,
                                                             final Dimension dimension) {
        if (Dimension.COLUMN.equals(dimension)) {
            final int initial_y = initialPosition.y();
            final int final_y = finalPosition.y();

            final int initial_x = initialPosition.x();

            for (int y = initial_y + 1; y < final_y; y++) {
                final Position position =
                        Position.builder()
                                .x(initial_x)
                                .y(y)
                                .build();

                if (getChessPiece(position).isPresent()) return true;
            }
        }

        return false;
    }

    public enum Dimension {
        COLUMN,
        ROW,

    };
}
