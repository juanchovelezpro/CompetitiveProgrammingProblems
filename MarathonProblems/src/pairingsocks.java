import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class pairingsocks {

    private int pairing(Stack<Integer> socks, int movements, Stack<Integer> aux) {

        if (socks.isEmpty() && aux.isEmpty()) {

            return movements;

        } else if (socks.isEmpty() && !aux.isEmpty()) {

            return -1;

        } else {

            if (!aux.isEmpty() && !socks.isEmpty()) {
                if (aux.peek() == socks.peek()) {

                    aux.pop();
                    socks.pop();
                    movements++;

                } else {

                    aux.push(socks.pop());
                    movements++;

                }

            } else {

                aux.push(socks.pop());
                movements++;

            }
        }

        return pairing(socks, movements, aux);

    }

    public int pairing(Stack<Integer> socks) {

        Stack<Integer> aux = new Stack<>();
        int movements = 0;
        aux.push(socks.pop());
        movements++;

        return pairing(socks, movements, aux);

    }


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        pairingsocks checker = new pairingsocks();


        int pairs = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        String[] socks = line.split(" ");
        Stack<Integer> mySocks = new Stack<>();

        for (int i = socks.length - 1; i >= 0; i--) {

            mySocks.push(Integer.parseInt(socks[i]));

        }

        int movements = checker.pairing(mySocks);

        if (movements != -1) {

            System.out.println(movements);

        } else {

            System.out.println("impossible");

        }


    }
}
