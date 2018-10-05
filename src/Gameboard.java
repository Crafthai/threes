public class Gameboard {

    String built = "| - - - - | - - - - | - - - - | - - - - |";
    StringBuilder[] board = new StringBuilder[16];
    String boardUpdated = "\n";

    public Gameboard() {
        for (int i = 0; i < 16; i++) {
            board[i] = new StringBuilder(built);
        }
    }

    public void update(char input){

    }

    public String toString() {
        for (int i = 0; i < 16; i++) {
            if(i%4 == 0){
                boardUpdated = boardUpdated + "\n" + "|---------------------------------------|";
            }
            boardUpdated = boardUpdated + "\n" + board[i];
        }
        boardUpdated = boardUpdated + "\n" + "|---------------------------------------|";

        return boardUpdated;
    }
}
