import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Digite um número: ");
        int numero1 = scanner.nextInt();

        if (numero1 % 2 == 0) {   
            System.out.println("PAR ");
            } else {
                  System.out.println("IMPAR");
            }
            
           scanner.close(); 
    } 

}