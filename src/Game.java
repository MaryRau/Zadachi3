import java.util.Scanner;

// задача 20
class Game
{
    private char[][] board;
    private int currentPlayerIndex;
    private Player_2[] players;

    public Game() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        currentPlayerIndex = 0;
        players = new Player_2[2];
    }

    public void displayBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean makeMove(int x, int y) {
        if (board[x][y] == ' ') {
            board[x][y] = players[currentPlayerIndex].getSymbol();
            return true;
        } else {
            System.out.println("Эта клетка уже занята. Попробуйте снова.");
            return false;
        }
    }

    public void switchPlayer() {
        currentPlayerIndex = 1 - currentPlayerIndex;
    }

    public boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
                return true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return true;
        }

        return false;
    }

    public void play() {
        do {
            displayBoard();
            Player_2 currentPlayer = players[currentPlayerIndex];
            int[] move = currentPlayer.makeMove();
            int x = move[0];
            int y = move[1];

            if (makeMove(x, y)) {
                if (checkWinner()) {
                    displayBoard();
                    System.out.println("Поздравляем, " + currentPlayer.getName() + "! Вы победили!");
                }
                switchPlayer();
            }
        }
        while (!checkWinner());
    }
}

class Player_2{
    private String name;
    private char symbol;

    public Player_2(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public int[] makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + ", введите ваши координаты (строка и столбец через пробел): ");
        String[] input = scanner.nextLine().split(" ");
        return new int[]{Integer.parseInt(input[0]), Integer.parseInt(input[1])};
    }
}