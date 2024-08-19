public class TicTacToe {
    public static void main(String[] args) {
        char[][] grid = { { 'X', 'X', 'O' },
                { 'O', 'O', 'X' },
                { 'X', 'O', 'O' } };
        for (int y = 0; y < 3; y++) { // Zeile für Zeile
            for (int x = 0; x < 3; x++) {
                System.out.print(grid[x][y]);
            }
            System.out.println(); //Zeilenwechsel
        }
    }
}
