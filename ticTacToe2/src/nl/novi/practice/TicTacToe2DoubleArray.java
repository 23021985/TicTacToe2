package nl.novi.practice;

import java.util.Scanner;

public class TicTacToe2DoubleArray {

    public static void main(String[] args) {
        // welkom
        System.out.println("welkom bij het spel boter kaas en eieren");

        //print het bord
        String[] board = new String[9];

        for (int i = 0; i < 9; i++) {
            board[i] = Integer.toString(i);
        }

        //toon het bord
        printboard(board);

        Boolean hasWon = false;

        String currentPlayer = "X";
        while (hasWon == false) {

            //geef speler A de mogelijkheid om een X te zetten
            System.out.println("\n voer een nummer van 0 t/m 8 in om een " + currentPlayer + "te zetten");
            Scanner UserInput = new Scanner(System.in);

            int selectedField = UserInput.nextInt();
            board[selectedField] = currentPlayer;

            hasWon = hasPlayerWon(board, currentPlayer);

            if (hasWon == true){
                printboard(board);
                System.out.println("\n Gefeliciteerd, je hebt gewonnen. De andere speler moet bier halen");
                break;
            }

            //print het bord
            printboard(board);

            //wissel van speler
            currentPlayer = switchPlayer(currentPlayer);
        }

    }
    //kijk of de speler gewonnen heeft
        public static void printboard(String[] board) {
        //toon het bord
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i]);

            boolean isEndOfRow = (i + 1) % 3 == 0;
            boolean isLastField = i == 0;

            if (isEndOfRow == false) {
                System.out.print(" | ");
            }
            if (isEndOfRow && !isLastField) {
                System.out.println("\n___________");
            }
        }
    }

    public static String switchPlayer(String currentPlayer) {
        if (currentPlayer == "X") {
            return "O";
        } else {
            return "X";
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



