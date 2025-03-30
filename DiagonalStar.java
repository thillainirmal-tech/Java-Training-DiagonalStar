public class DiagonalStar {

    private static final String STAR = "*";
    private static final String SPACE = " ";

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // Iterate over each row
        for (int row = 1; row <= number; row++) {
            // Iterate over each column
            for (int column = 1; column <= number; column++) {
                boolean isFirstRowOrColumn = row == 1 || column == 1;
                boolean isLastRowOrColumn = row == number || column == number;
                boolean isDiagonal = (row == column) || (column == (number - row + 1));

                if (isFirstRowOrColumn || isLastRowOrColumn || isDiagonal) {
                    System.out.print(STAR);
                } else {
                    System.out.print(SPACE);
                }
            }
            System.out.println();  // Move to the next line
        }
    }

    public static void main(String[] args) {
        System.out.println("Square star pattern for 5:");
        printSquareStar(5);

        System.out.println("\nSquare star pattern for 7:");
        printSquareStar(7);

        System.out.println("\nSquare star pattern for 4 (invalid):");
        printSquareStar(4);

        System.out.println("\nSquare star pattern for 6:");
        printSquareStar(6);
    }
}
