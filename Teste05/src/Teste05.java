import java.util.Scanner;
public class Teste05 {
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();
        
       
        scanner.close();
        
       
        String invertida = inverterString(input);
        
        
        System.out.println("String invertida: " + invertida);
    }
    
    
    public static String inverterString(String str) {
        
        String resultado = "";
        
       
        for (int i = str.length() - 1; i >= 0; i--) {
            resultado += str.charAt(i); 
        }
        
        return resultado; 
    }
}