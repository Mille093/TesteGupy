
public class Teste04 {

	public static void main(String[] args) {
        
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        
        double totalFaturamento = sp + rj + mg + es + outros;

        
        exibirPercentual("SP", sp, totalFaturamento);
        exibirPercentual("RJ", rj, totalFaturamento);
        exibirPercentual("MG", mg, totalFaturamento);
        exibirPercentual("ES", es, totalFaturamento);
        exibirPercentual("Outros", outros, totalFaturamento);
    }

  
    public static void exibirPercentual(String estado, double faturamento, double totalFaturamento) {
        double percentual = (faturamento / totalFaturamento) * 100;
        System.out.printf("Percentual de representação de %s: %.2f%%\n", estado, percentual);
    }
}