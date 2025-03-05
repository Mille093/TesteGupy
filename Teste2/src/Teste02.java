import java.util.Scanner;
public class Teste02 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        
        
        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

   
    public static boolean isFibonacci(int numero) {
        int a = 0, b = 1;

        
        if (numero == a || numero == b) {
            return true;
        }

       
        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        
        return b == numero;
    }

}
