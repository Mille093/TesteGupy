import java.util.Arrays;

public class Teste03 {

	   public static void main(String[] args) {
	        double[] faturamentoDiario = {
	            1200.50, 0, 1500.00, 1300.30, 0, 1400.00, 1250.20, 
	            1100.40, 0, 1800.10, 2000.00, 1600.00, 1500.20, 
	            1800.60, 1400.30, 0, 1700.50
	        };

	        double menorFaturamento = calcularMenorFaturamento(faturamentoDiario);
	        double maiorFaturamento = calcularMaiorFaturamento(faturamentoDiario);
	        double mediaMensal = calcularMediaMensal(faturamentoDiario);
	        int diasAcimaDaMedia = contarDiasAcimaDaMedia(faturamentoDiario, mediaMensal);

	        System.out.println("Menor faturamento: R$ " + menorFaturamento);
	        System.out.println("Maior faturamento: R$ " + maiorFaturamento);
	        System.out.println("Número de dias acima da média mensal: " + diasAcimaDaMedia);
	    }

	    public static double calcularMenorFaturamento(double[] faturamento) {
	        return Arrays.stream(faturamento)
	                     .filter(valor -> valor > 0)
	                     .min()
	                     .orElse(Double.MAX_VALUE);
	    }

	    public static double calcularMaiorFaturamento(double[] faturamento) {
	        return Arrays.stream(faturamento)
	                     .max()
	                     .orElse(Double.MIN_VALUE);
	    }

	    public static double calcularMediaMensal(double[] faturamento) {
	        return Arrays.stream(faturamento)
	                     .filter(valor -> valor > 0)
	                     .average()
	                     .orElse(0);
	    }

	    public static int contarDiasAcimaDaMedia(double[] faturamento, double media) {
	        return (int) Arrays.stream(faturamento)
	                           .filter(valor -> valor > media)
	                           .count();
	    }

}
