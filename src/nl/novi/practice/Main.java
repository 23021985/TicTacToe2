package nl.novi.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // welkom
        System.out.println("welkom bij het spel boter kaas en eieren");

        //print het bord
        Field[] board = new Field[9];

        for (int i = 0; i < 9; i++) {
            board[i] = new Field(Integer.toString(i));
        }

        //toon het bord
        printboard(board);

        Player playerA = new Player("kruisje,", "X");
        Player playerB = new Player("rondje", "O");

        Game game = new Game(playerA, playerB);

        boolean hasWon = false;

        while (!hasWon) {

            //geef speler A de mogelijkheid om een X te zetten
            System.out.println("\n voer een nummer van 0 t/m 8 in om een " + game.getCurrentPlayer().getName() +  "te zetten");

            Scanner UserInput = new Scanner(System.in);
            int selectedField = UserInput.nextInt();

            String currentPlayerToken = game.getCurrentPlayer().getToken();

            board[selectedField].setToken(currentPlayerToken);

            hasWon = game.hasPlayerWon(board);

            if(hasWon){
                game.getCurrentPlayer().setScore(1);
            }

            //print het bord
            printboard(board);

            //wissel van speler
            game.switchPlayer();
        }

        System.out.println("Speler " + playerA.getName() + "heeft een score van" + playerA.getScore());
        System.out.println("Speler " + playerB.getName() + "heeft een score van" + playerB.getScore());
    }
    //kijk of de speler gewonnen heeft
        public static void printboard(Field[] board) {
        //toon het bord
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i].getToken());

            boolean isEndOfRow = (i + 1) % 3 == 0;
            boolean isLastField = i == 0;

            if (!isEndOfRow) {
                System.out.print(" | ");
            }
            if (isEndOfRow && !isLastField) {
                System.out.println("\n___________");
            }
        }
    }

    public static Player switchPlayer(Player currentPlayer, Player playerA, Player playerB) {
        if (currentPlayer.getToken() == "X") {
            return playerB;
        } else {
            return playerA;
        }
    }

    //voeg een winconditie toe
    public static boolean hasPlayerWon(String[] board, String currentPlayer){

        // horizontale opties om te winnen
        if (board[0].equals(currentPlayer)  && board[1].equals(currentPlayer) && board[2].equals(currentPlayer)){
            return true;
        }
        if (board[3].equals(currentPlayer)  && board[4].equals(currentPlayer) && board[5].equals(currentPlayer)){
            return true;
        }
        if (board[6].equals(currentPlayer)  && board[7].equals(currentPlayer) && board[8].equals(currentPlayer)){
            return true;
        }
        //verticale opties om te winnen

        if (board[0].equals(currentPlayer)  && board[3].equals(currentPlayer) && board[6].equals(currentPlayer)){
            return true;
        }
        if (board[1].equals(currentPlayer)  && board[4].equals(currentPlayer) && board[7].equals(currentPlayer)){
            return true;
        }
        if (board[2].equals(currentPlayer)  && board[5].equals(currentPlayer) && board[8].equals(currentPlayer)){
            return true;
        }

        //diagonale opties om te winnen
        if (board[0].equals(currentPlayer)  && board[4].equals(currentPlayer) && board[8].equals(currentPlayer)){
            return true;
        }
        if (board[2].equals(currentPlayer)  && board[4].equals(currentPlayer) && board[6].equals(currentPlayer)){
            return true;
        }
        return false;
        }

        //voeg een menu toe
    }



