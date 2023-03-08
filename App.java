import java.util.Scanner;

public class App {

    public static void main(String[] args){

        int factorial;
        int result;

        System.out.println("Deseja obter o Fatorial de qual número?");
        try (Scanner input = new Scanner(System.in)) {

            factorial = input.nextInt();
            result = factorial;

            for (int i = (factorial -1); i >= 1; i--){

                result = result * i;

            };  

            System.out.println("O resultado final é " + result);

        }

    }

}