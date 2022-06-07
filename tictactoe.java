package Tictactoe;

import java.util.Scanner;

public class tictactoe {
    public static void printArray(String[][] tictactoe){
        for (int i = 0; i < tictactoe.length; i++)
        {
            for (int j=0; j < tictactoe.length; j++)
                System.out.print(tictactoe[i][j] + " ");
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int row, column;
        String[][] tictactoe = {{"-", "-", "-"},
                                {"-", "-", "-"},
                                {"-", "-", "-"},};
       
        System.out.println("Welcome to TicTacToe Game. ");

        for (int i = 0; i<9 ;i++){

            System.out.println("Please enter the row and the column you wanted to put your letter");
            row = input.nextInt();
            column = input.nextInt();

            if (row <=3 && row >=1 && column<=3 && column>=1){
                if (i%2==0){
                    if (tictactoe[row-1][column-1]== "-")
                        tictactoe[row-1][column-1]="X";
                    else
                    System.out.println("This place is taken");
                }
                
                else {
                    if (tictactoe[row-1][column-1]== "-")
                        tictactoe[row-1][column-1]="O";
                    else
                    System.out.println("This place is taken");
                }
            }

            else {
                System.out.println("You did not entered valid place numbers");
                break;
            }
            
            printArray(tictactoe);
        }
    }
}
