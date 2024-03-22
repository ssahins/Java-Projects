import java.util.Scanner;

public class GameTikTakToe {
    public static void main(String[] args) {

                char[][] arr = new char[3][3];

                for (int i = 0; i < arr.length; i++)
                    for (int j = 0; j < arr[i].length; j++)
                        arr[i][j] = ' ';

                Scanner scanner = new Scanner(System.in);

                System.out.println("Numbering of the board fields:");
                System.out.println(" 0 | 1 | 2 \n" +
                        "-----------\n" +
                        " 3 | 4 | 5 \n" +
                        "-----------\n" +
                        " 6 | 7 | 8 ");

                char[] players = {'o', 'x'};
                int player = (int)(Math.random()*2);
                System.out.println("Player starts: " + players[player]);

                boolean continueGame = true;

                do {
                    System.out.print("Player: " + players[player] + ". Select field number:");

                    int pole = scanner.nextInt();

                    while (arr[pole/3][pole%3] != ' ') {
                        System.out.println("The field is taken. Please choose again");
                        pole = scanner.nextInt();
                    }

                    arr[pole/3][pole%3] = players[player];

                    for (int i = 0; i < arr.length; i++){
                        for (int j = 0; j < arr[i].length; j++){
                            System.out.print(" " + arr[i][j] + " " + ((j<arr.length-1)?"|":""));
                        }
                        System.out.println((i<arr.length-1)?"\n-----------":"");
                    }

                    if ((arr[0][0] != ' ' && arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2]) ||
                            (arr[1][0] != ' ' && arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2]) ||
                            (arr[2][0] != ' ' && arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2]) ||
                            (arr[0][0] != ' ' && arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0]) ||
                            (arr[0][1] != ' ' && arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1]) ||
                            (arr[0][2] != ' ' && arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2]) ||
                            (arr[0][0] != ' ' && arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) ||
                            (arr[0][2] != ' ' && arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0])){
                        System.out.println("Winner: " + players[player]);
                        continueGame = false;
                    }

                    if (player == 0)
                        player = 1;
                    else
                        player = 0;

                }while (continueGame);

            }
    }

