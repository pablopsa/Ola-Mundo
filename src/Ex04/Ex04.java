import java.util.Scanner;

/**
 * Ex04
 */
public class Ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = scanner.nextInt();

        if (numero1 > 0) {
          System.out.println("POSITIVO!");  
        } else {
            if (numero1 < 0) {
              System.out.println("NEGATIVO!");  
            } else {
                System.out.println("ZERO!");
            }
        }
        scanner.close();
    }
}
