package caixademercado;

/**
 *
 * @author Vini
 */
public class CaixaDeMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        int contUsuario;
        double valorProd = 0;
        double valorImposto = 0;
        double valorTotal = 0;
        double valorGuardado = 0;
                
                
        contUsuario = Entrada.leiaInt("Quantos produtos queres ler?");
                
        while (cont != contUsuario) {
            
            valorProd = Entrada.leiaDouble("Escreva o valor do produto: ");  
            valorTotal = valorProd + valorTotal;
            
            cont++;
        }    
            
        System.out.println("O valor Total é: " + valorTotal);
        
        if (valorTotal > 500) {
            System.out.println("Compra maior que R$500,00, lendo impostos");
            
            cont = 0;
            
            while (cont != contUsuario) {
                valorImposto = Entrada.leiaDouble ("Valor do imposto");
                valorGuardado = valorGuardado + valorImposto;
                cont++;
            }
            
            System.out.println("Total de Impostos: " + valorGuardado);
            
        }
        
        System.exit(0);
        
    }
    
}
