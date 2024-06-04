import java.util.Scanner;
import java.util.Locale;

/**
 * programa para testar dois valores passados e imprimir e diferença entre eles
 * 
 */
public class Contador {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner terminal = new Scanner(System.in);
        //dados para o primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        //dados para o segundo parâmetro
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            e.printStackTrace();
            System.out.println("O segundo parâmetro deve ser maior do que o primeiro!!!\n");
        }
        terminal.close();
        
    }
    /**
     * 
     * @param parametroUm
     * @param parametroDois
     * @throws ParametrosInvalidosException
     */
    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo: " + i);
            }
        }
    }
}
