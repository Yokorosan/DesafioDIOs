package one.digitalinnovation.basecamp;

	import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                int minutos;
                int K;
                Scanner input = new Scanner(System.in);
                System.out.print("Coloque a distância da moto Y: ");
                K = input.nextInt();
                minutos = (K * 2);

                System.out.printf(minutos + " minutos\n" + K); // o tempo em minutos é calculado pela distância K vezes 2.
            }
        }
    }
}
