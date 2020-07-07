import java.util.ArrayList;
import java.util.Scanner;

public class marswindow {

    public boolean validate(int[] bases, int year){

        boolean[] res = new boolean[bases.length];

        for(int i = 0; i<bases.length; i++){

            res[i] = (year - bases[i]) % 13 == 0;

        }

        for(int i = 0; i<res.length; i++){

            if(res[i])
                return true;

        }

        return false;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        marswindow checker = new marswindow();
        int year = scan.nextInt();
        scan.nextLine();

        int[] bases = {2016,2018,2020,2022,2024,2026};

        ArrayList<Integer> integers = new ArrayList<>();

        for(int i = 0; i<bases.length; i++){

            integers.add(bases[i]);

        }

        if(integers.contains(year)){

            System.out.println("yes");

        }else{

            if(checker.validate(bases,year)){

                System.out.println("yes");

            }else{

                System.out.println("no");

            }

        }


    }

}
