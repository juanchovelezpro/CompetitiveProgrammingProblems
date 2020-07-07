import java.util.Scanner;

public class blackandwhite {

    public boolean verifyRows(char[][] grid) {

        boolean isGood = false;

        for (int i = 0; i < grid.length; i++) {

            int black = 0;
            int white = 0;

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 'W') {

                    white++;

                } else {

                    black++;

                }


            }

            if (black != white) {

                return false;

            } else {

                isGood = true;

            }


        }


        return isGood;

    }

    public boolean verifyColumns(char[][] grid) {

        boolean isGood = false;

        for (int i = 0; i < grid.length; i++) {

            int black = 0;
            int white = 0;

            for (int j = 0; j < grid[0].length; j++) {


                if (grid[j][i] == 'W') {

                    white++;

                } else {

                    black++;

                }


            }

            if (black != white) {

                return false;

            } else {

                isGood = true;

            }

        }


        return isGood;

    }

    public boolean consecutiveGreaterThan3Rows(char[][] grid) {

        boolean isGood = false;


        for (int i = 0; i < grid.length; i++) {


            int counter = 1;

            for (int j = 0; j < grid[0].length; j++) {

                if (j > 0) {

                    if (grid[i][j] == grid[i][j - 1]) {

                        counter++;

                    } else {

                        counter = 0;

                    }

                }


            }

            if (counter >= 3) {

                return false;

            } else {

                isGood = true;

            }

        }

        return isGood;

    }

    public boolean consecutiveGreaterThan3Cols(char[][] grid) {

        boolean isGood = false;


        for (int i = 0; i < grid.length; i++) {


            int counter = 1;

            for (int j = 0; j < grid[0].length; j++) {

                if (j > 0) {

                    if (grid[j][i] == grid[j - 1][i]) {

                        counter++;

                    } else {

                        counter = 0;

                    }

                }


            }

            if (counter >= 3) {

                return false;

            } else {

                isGood = true;

            }

        }

        return isGood;

    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        blackandwhite checker = new blackandwhite();

        int lines = scan.nextInt();
        scan.nextLine();
        char[][] grid = new char[lines][lines];

        for (int i = 0; i < lines; i++) {

            String cLine = scan.nextLine();

            for (int j = 0; j < lines; j++) {

                grid[i][j] = cLine.charAt(j);

            }

        }

        if (checker.verifyColumns(grid) && checker.verifyRows(grid) && checker.consecutiveGreaterThan3Cols(grid) && checker.consecutiveGreaterThan3Rows(grid)) {

            System.out.println("1");

        } else {

            System.out.println("0");

        }

    }

}
