package TictacToeGame;

import java.util.Scanner;

public class TicTacToe {
    // this is the manager class
    // this interacts with the player and the board

    private Player player1, player2;
    private Board board;
    private int numPLayers;


    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.startGame();
    }
    public void startGame(){
        Scanner sc = new Scanner(System.in);
        // Take players input.
        player1 = takePlayerInput(++numPLayers);
        player2 = takePlayerInput(++numPLayers);
        while(player1.getSymbol() == player2.getSymbol()){
            System.out.println("Symbol already taken!! Please take another symbol!");
            player2.setSymbol(sc.next().charAt(0));
        }
        
        // Create the board.
        board = new Board(player1.getSymbol(), player2.getSymbol());
        
        // Play the game.
        boolean player1Turn = true;
        int status = Board.INCOMPLETE;
        while(status == Board.INCOMPLETE || status == Board.INVALIDMOVE){
            if(player1Turn){
                System.out.println("Player1- "+player1.getName()+"'s turn");
                System.out.println("Enter x: ");
                int x = sc.nextInt();
                System.out.println("Enter y: ");
                int y = sc.nextInt();

                status = board.move(player1.getSymbol(), x, y);
                if(status==Board.INVALIDMOVE){
                    System.out.println("Invalid move!! PLease try again!!");
                    continue;
                }
            }else{
                System.out.println("Player2- "+player2.getName()+"'s turn");
                System.out.println("Enter x: ");
                int x = sc.nextInt();
                System.out.println("Enter y: ");
                int y = sc.nextInt();

                status = board.move(player2.getSymbol(), x, y);
                if(status==Board.INVALIDMOVE){
                    System.out.println("Invalid move!! PLease try again!!");
                    continue;
                }
            }
            player1Turn = !player1Turn;
            board.print();
        }
        

        if(status == Board.PLAYER1WINS){
            System.out.println("Player 1- "+player1.getName()+" wins.");
        }else if(status == Board.PLAYER2WINS){
            System.out.println("Player 2- "+player2.getName()+" wins.");
        }
        else{
            System.out.println("DRAW!!");
        }

    }

    private Player takePlayerInput(int num){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player "+ num+" name: ");
        String name = sc.nextLine();
        System.out.println("Enter Player "+ num+" symbol: ");
        char symbol = sc.next().charAt(0);
        Player p =new Player(name, symbol);
        return p;
    }
}
