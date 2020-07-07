import java.util.Scanner;

public class evenorodd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        scan.nextLine();
        int sum = 0;

        for(int i = 1; i<=number; i++){

            sum+= i;

        }

        if(number != 1) {
            if (sum % 2 == 0) {

                System.out.println("Even");

            } else {

                System.out.println("Odd");

            }
        }else{

            System.out.println("Either");

        }
    }

}

